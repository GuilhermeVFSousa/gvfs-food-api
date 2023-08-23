package com.gvfs.gfood.api.controller;

import com.gvfs.gfood.domain.model.Estado;
import com.gvfs.gfood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping
    List<Estado> listar() {
        return estadoRepository.listar();
    }
}
