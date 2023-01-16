package com.example.gerenciamento.empregados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gerenciamento.empregados.entity.EntidadeEmpregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<EntidadeEmpregado, Long> {

}
