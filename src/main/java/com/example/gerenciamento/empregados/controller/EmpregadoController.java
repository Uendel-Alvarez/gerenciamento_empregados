package com.example.gerenciamento.empregados.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gerenciamento.empregados.entity.EntidadeEmpregado;
import com.example.gerenciamento.empregados.service.EmpregadoService;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {
	
	private final EmpregadoService empregadoService;

	public EmpregadoController(EmpregadoService empregadoService) {
		
		this.empregadoService = empregadoService;
	}
	
	@GetMapping
	public List<EntidadeEmpregado> findAllEmpregados() {
		return empregadoService.findAllEmpregados();
	}
	
	@GetMapping("/{id}")
	public Optional<EntidadeEmpregado> findEmpregadoById(@PathVariable("id") Long id) {
		return empregadoService.findEmpregadoById(id);
		
	}
	
	@PostMapping
	public EntidadeEmpregado saveEmpregado(@RequestBody EntidadeEmpregado empregadoEntity) {
		return empregadoService.saveEmpregado(empregadoEntity);
		
	}
	
	@PutMapping
	public EntidadeEmpregado updateEmpregado(@RequestBody EntidadeEmpregado empregadoEntity) {
		return empregadoService.updateEmpregado(empregadoEntity);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmpregado(@PathVariable("id") Long id) {
		empregadoService.deleteEmpregado(id);
	}
	
	

}
