package com.academico.base;

import java.util.List;

public class Aluno extends identificador {

	public String nomeAluno;
	public int rg;
	public int cpf;
	public int dataNascimento;
	public String mae;
	public String pai;
	public String endereco;
	public int telefone;
	
	
	public List<Nota> nota;


	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getMae() {
		return mae;
	}


	public void setMae(String mae) {
		this.mae = mae;
	}


	public String getPai() {
		return pai;
	}


	public void setPai(String pai) {
		this.pai = pai;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public List<Nota> getNota() {
		return nota;
	}


	public void setNota(List<Nota> nota) {
		this.nota = nota;
	}

}
