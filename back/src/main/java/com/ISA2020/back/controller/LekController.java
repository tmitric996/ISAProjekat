package com.ISA2020.back.controller;

import com.ISA2020.back.request.LekRequest;
import com.ISA2020.back.response.LekResponse;
import com.ISA2020.back.service.LekService;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.ISA2020.back.converter.LekConverter.toResponses;

@RestController
@RequestMapping("/lek")
public class LekController {

    private final LekService lekService;

    public LekController(LekService lekService) {
        this.lekService = lekService;
    }

    @GetMapping("/sve")
    public List<LekResponse> vratiSveLekove(){
        return toResponses(lekService.getAll());
    }

    @PostMapping("/dodaj")
    @ResponseStatus(HttpStatus.CREATED)
    public void dodajLek(@Valid @RequestBody LekRequest lekRequest){
        lekService.dodaj(lekRequest);
    }

    @PostMapping("/{id}/overi")
    public void overiLek(@PathVariable("id") Long id, @AuthenticationPrincipal Long idOverivaca){
        lekService.overi(id, idOverivaca);
    }
}
