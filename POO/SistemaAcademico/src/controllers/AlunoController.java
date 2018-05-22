package controllers;

import DAO.AlunoDAO;
import DAO.TurmaDAO;
import interfaces.CadastrarAluno;
import interfaces.CancelarMatricula;
import interfaces.EnturmarAluno;
import interfaces.MudarEnturmacao;

public class AlunoController {
	
	public String cunsultar(MudarEnturmacao consultarAluno){
		return null;
		
	}
	
	public void reenturmar(MudarEnturmacao reenturmarAluno){
		Validador validador = new Validador();
		boolean validacao = validador.validar(reenturmarAluno);
		
		if(validacao){
			AlunoDAO alunoDAO = new AlunoDAO();
			alunoDAO.salvar(reenturmarAluno);
			
		}
	}
	
	public void cadastrarAluno(CadastrarAluno cadastrarAluno){
		Validador validador = new Validador();
		boolean validacao =  validador.validar(cadastrarAluno);
		
		if(validacao){
			AlunoDAO alunoDAO = new AlunoDAO();
			alunoDAO.salvar(cadastrarAluno);
		}
	}
	
	public void enturmar(EnturmarAluno enturmarAluno){
		Validador validador = new Validador();
		boolean validacao = validador.validar(enturmarAluno);
		
		if(validacao){
			TurmaDAO turmaDAO = new TurmaDAO();
			turmaDAO.salvar(enturmarAluno);
		}
	}
	
	public String consultar(CancelarMatricula consultarAluno){
		return null;
	}
	
	public void cancelarMatricula(CancelarMatricula cancelarMatricula){
		Validador validador = new Validador();
		boolean validacao = validador.validar(cancelarMatricula);
		
		if(validacao){
			AlunoDAO alunoDAO = new AlunoDAO();
			alunoDAO.cancelarMatricula(cancelarMatricula);
		}
	}
	
	
}
