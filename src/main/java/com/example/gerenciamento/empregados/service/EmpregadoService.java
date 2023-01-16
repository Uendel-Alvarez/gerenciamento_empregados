package com.example.gerenciamento.empregados.service;

import java.util.List;
import java.util.Optional;

import com.example.gerenciamento.empregados.entity.EntidadeEmpregado;

public interface EmpregadoService {

	List<EntidadeEmpregado> findAllEmpregados();
	Optional<EntidadeEmpregado> findEmpregadoById(Long id);
	EntidadeEmpregado saveEmpregado(EntidadeEmpregado empregadoEntity);
	EntidadeEmpregado updateEmpregado(EntidadeEmpregado empregadoEntity);
	void deleteEmpregado(Long id);
}
