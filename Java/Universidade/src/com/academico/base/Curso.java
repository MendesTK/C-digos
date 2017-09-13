package com.academico.base;

import java.util.List;

public class Curso extends identificador {
	
	public String nomeCurso;
	
	
	public List<Turma> turma;


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public List<Turma> getTurma() {
		return turma;
	}


	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

}
