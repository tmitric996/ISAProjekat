package com.ISA2020.back.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ISA2020.back.model.TipPregleda;
import com.ISA2020.back.service.TipPregledaServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/tippregleda")
public class TipPregledaController {

	@Autowired
	TipPregledaServiceImpl tipPregledaService;
	
	@PostMapping()
	public TipPregleda save(@RequestBody TipPregleda tp) {
		return tipPregledaService.save(tp);
	}
	
	@GetMapping()
	public List<TipPregleda> findAll(){
		return tipPregledaService.findAll();
	}
	
	@GetMapping("/{id}")
	public TipPregleda findById(@RequestBody int i) {
		return tipPregledaService.findById(i);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@RequestBody int i) throws IOException {
		tipPregledaService.delete(i);
	}
	
	@PostMapping("/{id}")
	public void changeSala(@RequestBody TipPregleda tp) {
		tipPregledaService.save(tp);
	}

}
