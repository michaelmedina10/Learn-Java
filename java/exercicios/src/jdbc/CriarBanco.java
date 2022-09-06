package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CriarBanco {
	public static void main(String[] args) throws SQLException, IOException {
		Properties prop = FabricaConexao.getProperties();
		final String url = prop.getProperty("banco.url");
		final String usuario = prop.getProperty("banco.usuario");
		final String senha = prop.getProperty("banco.senha");
		
		Connection conexao = DriverManager.getConnection(
				url, usuario, senha);
		
//		Connection conexao = FabricaConexao.getConexao();
	
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco Criado com Sucesso!!");
		conexao.close();
	}
}
