package com.GasMonkey.VeiculosServ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GasMonkey.VeiculosServ.entities.ContasMes;
import com.GasMonkey.VeiculosServ.repositories.ContasMesRepository;

@RestController
@RequestMapping(value = "/contas")
public class ContasMesController {
	
	@Autowired
	private ContasMesRepository repository;

	@GetMapping
	public List<ContasMes> findAll(){
		List<ContasMes> result = repository.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{id}")
	public ContasMes findById(@PathVariable Long id){
		ContasMes result = repository.findById(id).get();
		return result;
		
	}
	
	@PostMapping
	public ContasMes insert(@RequestBody ContasMes contasmes){
		ContasMes result = repository.save(contasmes);
		return result;
		
	}
}