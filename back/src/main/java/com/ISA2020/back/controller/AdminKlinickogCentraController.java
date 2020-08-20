package com.ISA2020.back.controller;

import com.ISA2020.back.model.NeautentifikovaniKorisnik;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adminklinickogcentra")
public class AdminKlinickogCentraController {

    @GetMapping("/neautentifikovanikorisnici")
    public List<NeautentifikovaniKorisnik> neautentifikovaniKorisnici(){
        return new ArrayList<>();
    }
    //razlika izmedju put i post, razlika izmedju put i fetch
    @PostMapping("/neautentifikovankorisnik/{id}/odobri")
    public void odobriKorisnika(@PathVariable Long id){

    }

    @PostMapping("/neautentifikovankorisnik/{id}/odbij")
    public void odbijKorisnika(@PathVariable Long id){

    }

    @PostMapping("/neautentifikovankorisnik/{id}/dodajadminakc")
    public void dodajAdminaKC(@PathVariable Long id){

    }
}
