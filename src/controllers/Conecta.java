package controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {

	private Connection conexao;

	public Conecta() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;databaseName=DB_ProjetoFL";
		conexao = DriverManager.getConnection(url, "sa", "MSSQLSERVER");
	}

	public Connection getConecta() {
		return conexao;
	}

}