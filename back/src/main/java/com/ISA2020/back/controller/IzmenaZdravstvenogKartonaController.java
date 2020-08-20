package com.ISA2020.back.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/izmenazdravstvenogkartona")
public class IzmenaZdravstvenogKartonaController {
    @PutMapping("/izmenizdravstvenikarton")
    public void izmeniZdravstveniKarton(){
        
    }
}
