package com.academico.base;

import java.util.List;

public class Professor extends identificador {
	
	public String nomeProfesor;
	public int rg;
	public int cpf;
	public String endereco;
	public String turno;
	public int telefone;
	
	public List<Disciplina> disciplinas;

	public String getNomeProfesor() {
		return nomeProfesor;
	}

	public void setNomeProfesor(String nomeProfesor) {
		this.nomeProfesor = nomeProfesor;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
