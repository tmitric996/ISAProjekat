package com.ISA2020.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operacija")
public class OperacijaController {

    @GetMapping("/sve")
    public List<OperacijeResponse> vratiSveOperacije(){

    }

    @PostMapping("/zakazi")
    public void zakaziOperaciju(){

    }

    @PostMapping("/promenidatum")
    public void promeniDatum(){

    }
}
