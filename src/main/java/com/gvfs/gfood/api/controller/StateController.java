package com.gvfs.gfood.api.controller;

import com.gvfs.gfood.domain.model.State;
import com.gvfs.gfood.domain.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    List<State> findAll() {
        return stateRepository.findAll();
    }
}
