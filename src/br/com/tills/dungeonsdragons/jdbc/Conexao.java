package br.com.tills.dungeonsdragons.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public static Connection conecta() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm93042", "251088");
		return con;
		
		
	}
	
	
	
	

}
