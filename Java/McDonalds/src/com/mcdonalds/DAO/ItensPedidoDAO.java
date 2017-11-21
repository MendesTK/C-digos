package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mcdonalds.modelo.ItensPedido;

public class ItensPedidoDAO {

	private Connection con = null;
	private PreparedStatement statement = null;
	
	public ItensPedidoDAO(){
		con = ConnectionFactory.getConnection();
	}
	
	public void InserirItens(ItensPedido itensInf) throws SQLException {
		String sql = "EXEC upsInserirItens ?, ?";
		
		statement = con.prepareStatement(sql);
		statement.setInt(1, itensInf.getInformarIDP());
		statement.setInt(2, itensInf.getInformarQtd());
		
		statement.execute();
	}
	
}