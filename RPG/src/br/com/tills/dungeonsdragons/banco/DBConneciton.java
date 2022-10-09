package br.com.tills.dungeonsdragons.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConneciton {

	
	public static Connection getConnection () throws SQLException {
		
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","rm93915","060696");
		
		return conexao;
	}
}
