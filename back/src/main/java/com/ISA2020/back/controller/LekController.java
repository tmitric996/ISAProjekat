package com.ISA2020.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lek")
public class LekController {
    @GetMapping("/sve")
    public List<LekResponse> vratiSveLekove(){

    }

    @PostMapping("/dodaj")
    public void dodajLek(){

    }

    @PostMapping("/overi")
    public void overiLek(){

    }

}
