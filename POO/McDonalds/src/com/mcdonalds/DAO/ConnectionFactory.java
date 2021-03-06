package com.mcdonalds.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	private static ConnectionFactory instance = new ConnectionFactory();
	public static final String URL = "jdbc:sqlserver://192.168.0.107:1433;";
	public static final String DATABASENAME = "databaseName=MC_Donalds;";
	public static final String USER = "Mendes";
	public static final String PASSWORD = "123456";
	public static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private ConnectionFactory(){
		try{
			Class.forName(DRIVER_CLASS);
			
		}catch(ClassNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		
	}
	
	private Connection createConnection(){
		Connection con = null;
		
		try{
			con = DriverManager.getConnection(URL + DATABASENAME, USER, PASSWORD);
			
		}catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
		return con;
	}
	
	public static Connection getConnection(){
		return instance.createConnection();
	}
	
	
	

}
