package controllers;

import DAO.DiarioDAO;
import interfaces.ConsultarDiario;

public class ProfessorController {
	
	public String consultar (ConsultarDiario consultarDiario){
		
		Validador validador = new Validador();
		boolean validacao = validador.validar(consultarDiario);
		
		if (validacao){
			DiarioDAO diarioDAO = new DiarioDAO();
			diarioDAO.consultar(consultarDiario);
		}
		return null;
	}
	
}
