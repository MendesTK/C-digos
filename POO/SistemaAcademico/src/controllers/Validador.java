package controllers;

import interfaces.CadastrarAluno;
import interfaces.CancelarMatricula;
import interfaces.ConsultarDiario;
import interfaces.EnturmarAluno;
import interfaces.MudarEnturmacao;

public class Validador {

	public boolean validar(ConsultarDiario consultarDiario){
		return false;
	}
	
	public boolean validar(MudarEnturmacao reenturmarAluno){
		return false;
	}
	
	public boolean validar(CadastrarAluno cadastrarAluno){
		return false;
	}
	public boolean validar(EnturmarAluno enturmarAluno){
		return false;
	}
	public boolean validar(CancelarMatricula cancelarMatricula){
		return false;
	}
}
