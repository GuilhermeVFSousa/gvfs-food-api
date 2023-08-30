package com.gvfs.gfood.api.controller;

import com.gvfs.gfood.domain.model.Kitchen;
import com.gvfs.gfood.domain.repository.KitchenRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/kitchens")
public class KitchenController {

    @Autowired
    private KitchenRepository kitchenRepository;

    @GetMapping
    public List<Kitchen> findAll() {
        return kitchenRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kitchen> findById(@PathVariable("id") Long id) {
        var kitchen = kitchenRepository.findById(id);

        if (kitchen != null) {
            return ResponseEntity.ok().body(kitchen);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Kitchen> save(@RequestBody Kitchen kitchen) {
        var savedKitchen = kitchenRepository.save(kitchen);
        var uri = URI.create("/kitchens/" + savedKitchen.getId());
        return ResponseEntity.created(uri).body(savedKitchen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kitchen> update(@PathVariable Long id, @RequestBody Kitchen kitchen) {
        var currentKitchen = kitchenRepository.findById(id);
        if (kitchen != null && currentKitchen != null) {
//            currentKitchen.setNome(kitchen.getNome());
            BeanUtils.copyProperties(kitchen, currentKitchen, "id");
            currentKitchen = kitchenRepository.save(currentKitchen);
            return ResponseEntity.ok().body(currentKitchen);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            var kitchen = kitchenRepository.findById(id);
            if (kitchen != null) {
                kitchenRepository.remove(kitchen);
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.notFound().build();
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
}
