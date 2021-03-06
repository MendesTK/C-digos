package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mcdonalds.modelo.ItensPedido;

public class ItensPedidoDAO {

	private Connection con = null;
	private PreparedStatement statement = null;
	
	public ItensPedidoDAO(){
		con = ConnectionFactory.getConnection();
	}
	//Inserir os itens de um pedido
	public void InserirItens(ItensPedido itensInf) throws SQLException {
		String sql = "EXEC upsInserirItens ?, ?";
		
		statement = con.prepareStatement(sql);
		statement.setInt(1, itensInf.getInformarIDP());
		statement.setInt(2, itensInf.getInformarQtd());
		
		statement.execute();
	}
	//Exibir itens atuais
	public List<ItensPedido> ExibirItensNota() throws SQLException {
		String sql = "";
		
		List<ItensPedido> itens = new ArrayList<ItensPedido>();
		
		
		return itens;
	}
	
	
}
