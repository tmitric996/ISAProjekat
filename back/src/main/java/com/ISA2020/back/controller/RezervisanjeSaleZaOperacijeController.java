package com.ISA2020.back.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rezervisanjesalezaoperacije")
public class RezervisanjeSaleZaOperacijeController {

    @PostMapping("/rezervacijasale")
    public void rezervacijaSale(){

    }
}
