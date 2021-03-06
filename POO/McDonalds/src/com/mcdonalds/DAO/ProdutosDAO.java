package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mcdonalds.modelo.Produtos;

public class ProdutosDAO {
	
	private Connection con = null;
	private PreparedStatement statement = null;
	
	public ProdutosDAO() {
		con = ConnectionFactory.getConnection();
	}
	
	//Listar os Produtos no banco de dados
	public List<Produtos> findAll() throws SQLException {
		String sql = "SELECT * FROM Produtos";
		List<Produtos> produtos = new ArrayList<Produtos>();
		
		statement = con.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		
		while (rs.next()){
			produtos.add(new Produtos(rs.getInt("id_Produto"), rs.getString("nome_Produto"), rs.getFloat("valor_Unit") 
					, rs.getFloat("desconto"), rs.getString("combo")));
		}
		return produtos;
		
	}
	
	//Listar apenas 1 produto informando o id
	public Produtos findById(int id_Produto) throws SQLException {
		String sql = "SELECT * FROM Produtos WHERE id_Produto = ?";
		
		statement = con.prepareStatement(sql);
		statement.setInt(1, id_Produto);
		ResultSet rs = statement.executeQuery();
		
		Produtos produto = null;
		while(rs.next()){
			produto = new Produtos(rs.getInt("id_Produto"), rs.getString("nome_Produto"), rs.getFloat("valor_Unit") 
					, rs.getFloat("desconto"), rs.getString("combo"));
		}
		return produto;
	}
	
	//inserir um novo produto
	public void insert(Produtos produto) throws SQLException {
		String sql = "INSERT Produtos (nome_Produto, valor_Unit, desconto, combo) VALUES (?, ?, ?, ?)";
		
		statement = con.prepareStatement(sql);
		statement.setString(1, produto.getNome_Produto());
		statement.setFloat(2, produto.getValor_Unit());
		statement.setFloat(3, produto.getDesconto());
		statement.setString(4, produto.getCombo());
		
		statement.execute();
		
	}
	
	//remover do banco de dados
	public void remove(Produtos produto) throws SQLException {
		String sql = "DELETE FROM Produtos WHERE id_Produto = ?";
		
		statement = con.prepareStatement(sql);
		statement.setInt(1, produto.getId_Produto());
		
		statement.execute();
	}
		
	

}
