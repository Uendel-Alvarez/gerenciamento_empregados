package com.example.gerenciamento.empregados.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gerenciamento.empregados.entity.EntidadeEmpregado;
import com.example.gerenciamento.empregados.repository.EmpregadoRepository;
import com.example.gerenciamento.empregados.service.EmpregadoService;

@Service
public class EmpregadoServiceImpl implements EmpregadoService{
	
	private final EmpregadoRepository empregadoRepository;

	public EmpregadoServiceImpl(EmpregadoRepository empregadoRepository) {
		super();
		this.empregadoRepository = empregadoRepository;
	}

	@Override
	public List<EntidadeEmpregado> findAllEmpregados() {
		// TODO Auto-generated method stub
		return empregadoRepository.findAll();
	}

	@Override
	public Optional<EntidadeEmpregado> findEmpregadoById(Long id) {
		// TODO Auto-generated method stub
		return empregadoRepository.findById(id);
	}

	@Override
	public EntidadeEmpregado saveEmpregado(EntidadeEmpregado empregadoEntity) {
		// TODO Auto-generated method stub
		return empregadoRepository.save(empregadoEntity);
	}

	@Override
	public EntidadeEmpregado updateEmpregado(EntidadeEmpregado empregadoEntity) {
		// TODO Auto-generated method stub
		return empregadoRepository.save(empregadoEntity);
	}

	@Override
	public void deleteEmpregado(Long id) {
		// TODO Auto-generated method stub
		empregadoRepository.deleteById(id);
	}

}
