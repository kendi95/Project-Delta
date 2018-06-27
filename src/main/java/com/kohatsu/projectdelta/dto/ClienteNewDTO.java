package com.kohatsu.projectdelta.dto;

import java.io.Serializable;

import com.kohatsu.projectdelta.domain.Endereco;

public class ClienteNewDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private char sexo;
	private String cpf;
	
	private Integer idTel;
	private String ddd;
	private String numeroTel;
	
	private Integer idEnd;
	private String logradouro;
	private String numeroEnd;
	private String complemento;
	private String bairro;
	private String cep;
	
	private Endereco endereco;
	
	
	public ClienteNewDTO() {}
	
	
	public ClienteNewDTO(Integer id, String nome, char sexo, String cpf, Integer idTel, String ddd, String numeroTel,
			Integer idEnd, String logradouro, String numeroEnd, String complemento, String bairro, String cep) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdTel() {
		return idTel;
	}
	public void setIdTel(Integer idTel) {
		this.idTel = idTel;
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
	public Integer getIdEnd() {
		return idEnd;
	}
	public void setIdEnd(Integer idEnd) {
		this.idEnd = idEnd;
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
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteNewDTO [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", idTel=");
		builder.append(idTel);
		builder.append(", ddd=");
		builder.append(ddd);
		builder.append(", numeroTel=");
		builder.append(numeroTel);
		builder.append(", idEnd=");
		builder.append(idEnd);
		builder.append(", logradouro=");
		builder.append(logradouro);
		builder.append(", numeroEnd=");
		builder.append(numeroEnd);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", cep=");
		builder.append(cep);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
