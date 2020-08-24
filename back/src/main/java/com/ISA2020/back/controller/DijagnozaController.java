package com.ISA2020.back.controller;

import com.ISA2020.back.service.DijagnozaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/dijagnoza")
public class DijagnozaController {

    private final DijagnozaService dijagnozaService;

    public DijagnozaController(DijagnozaService dijagnozaService) {
        this.dijagnozaService = dijagnozaService;
    }

    @GetMapping("/sve")
    public List<DijagnozaResponse> vratiSveDijagnoze(){

    }

    @PostMapping("/dodaj")
    @ResponseStatus(HttpStatus.CREATED)
    public void dodajDijagnozu(@Valid @RequestBody DijagnozaRequest dijagnozaRequest){
        dijagnozaService.dodaj(dijagnozaRequest);
    }
}
