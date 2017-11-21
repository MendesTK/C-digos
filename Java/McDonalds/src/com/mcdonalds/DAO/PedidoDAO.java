package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {
	
	private Connection con = null;
	private PreparedStatement statement = null;
	
	public PedidoDAO(){
		con = ConnectionFactory.getConnection();
	}
	
	public void AbrirPedido() throws SQLException {
		String sql = "EXEC upsAbrirPedido";
		
		statement = con.prepareStatement(sql);
		statement.execute();
		
	}

}
