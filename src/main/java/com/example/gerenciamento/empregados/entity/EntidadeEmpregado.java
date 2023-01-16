package com.example.gerenciamento.empregados.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empregados")
public class EntidadeEmpregado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empregado")
	private Long id;
	@Column(name = "Nome do Empregado")
	private String nome;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Data de Nascimento")
	private Date dataNasc;
	@Column(name = "Endereço Residencial")
	private String endereco;
	
	public EntidadeEmpregado() {
		super();
	}

	public EntidadeEmpregado(Long id, String nome, String sexo, Date dataNasc, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
