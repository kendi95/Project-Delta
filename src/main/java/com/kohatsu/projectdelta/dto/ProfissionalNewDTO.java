package com.kohatsu.projectdelta.dto;

import java.io.Serializable;

public class ProfissionalNewDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	
	private Integer idTel;
	private String ddd;
	private String numeroTel;
	
	private Integer idEnd;
	private String logradouro;
	private String numeroEnd;
	private String complemento;
	private String bairro;
	private String cep;
	
	
	public ProfissionalNewDTO() {}
	
	
	
	
	
	public ProfissionalNewDTO(Integer id, String nome, String cpf, String email, Integer idTel, String ddd,
			String numeroTel, Integer idEnd, String logradouro, String numeroEnd, String complemento, String bairro,
			String cep) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idTel = idTel;
		this.ddd = ddd;
		this.numeroTel = numeroTel;
		this.idEnd = idEnd;
		this.logradouro = logradouro;
		this.numeroEnd = numeroEnd;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}





	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroEnd() {
		return numeroEnd;
	}
	public void setNumeroEnd(String numeroEnd) {
		this.numeroEnd = numeroEnd;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Integer getIdEnd() {
		return idEnd;
	}
	public void setIdEnd(Integer idEnd) {
		this.idEnd = idEnd;
	}
	public Integer getIdTel() {
		return idTel;
	}
	public void setIdTel(Integer idTel) {
		this.idTel = idTel;
	}
	
}
