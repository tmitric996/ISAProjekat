package com.ISA2020.back.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/informacijeopregledu")
public class InformacijeOPregleduController {

    @PostMapping("/unesiinformacijeopregledu")
    public void unesiInformacijeOPregledu(){

    }

    @PostMapping("/sacuvajinformacijeopregledu")
    public void sacuvajInformacijeOPregledu(){

    }
}
