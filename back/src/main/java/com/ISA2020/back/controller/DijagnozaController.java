package com.ISA2020.back.controller;

//import com.ISA2020.back.service.DijagnozaService;
import com.ISA2020.back.model.Dijagnoza;
import com.ISA2020.back.request.DijagnozaRequest;
import com.ISA2020.back.response.DijagnozaResponse;
import com.ISA2020.back.service.DijagnozaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.ISA2020.back.converter.DijagnozaConverter.toResponses;

@RestController
@RequestMapping("/dijagnoza")
public class DijagnozaController {

    private final DijagnozaService dijagnozaService;

    public DijagnozaController(DijagnozaService dijagnozaService) {
        this.dijagnozaService = dijagnozaService;
    }

    @GetMapping("/sve")
    public List<DijagnozaResponse> vratiSveDijagnoze(){
        return toResponses(dijagnozaService.getAll());
    }

    @PostMapping("/dodaj")
    @ResponseStatus(HttpStatus.CREATED)
    public void dodajDijagnozu(@Valid @RequestBody DijagnozaRequest dijagnozaRequest){
        dijagnozaService.dodaj(dijagnozaRequest);
    }
}
