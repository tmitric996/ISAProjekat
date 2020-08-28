package com.ISA2020.back.controller;

import com.ISA2020.back.request.OperacijaRequest;
import com.ISA2020.back.request.PromenaDatumaRequest;
import com.ISA2020.back.response.OperacijaResponse;
import com.ISA2020.back.service.OperacijaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.ISA2020.back.converter.OperacijaConverter.toResponses;


@RestController
@RequestMapping("/operacija")
public class OperacijaController {


	 
    private final OperacijaService operacijaService;

    public OperacijaController(OperacijaService operacijaService) {
        this.operacijaService = operacijaService;
    }

    @GetMapping("/sve")
    public List<OperacijaResponse> vratiSveOperacije(){
        return toResponses(operacijaService.getAll());
    }

    @PostMapping("/dodaj")
    @ResponseStatus(HttpStatus.CREATED)
    public void zakaziOperaciju(@Valid @RequestBody OperacijaRequest operacijaRequest){
        operacijaService.dodaj(operacijaRequest);
    }

    
    @PutMapping("/{id}/promenidatum")
    @ResponseStatus(HttpStatus.OK)
    public void promeniDatum(@Valid @RequestBody PromenaDatumaRequest promenaDatumaRequest, @PathVariable("id") Long id){
        operacijaService.promeniDatum(promenaDatumaRequest, id);
    }

}
