package jogo;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/jogo";
		String usuario = "root";
		String senha = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;

		} else {
			return false;
		}
	}

	public void listarusuarios() {
		try {
			String query = "SELECT * FROM usuario ORDER BY pontos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while (this.resultset.next()) {
				System.out.println("ID : " + this.resultset.getString("id") + " Nome : "
						+ this.resultset.getString("nome") + " Pontos :" + this.resultset.getString("pontos"));
			}
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}
	}

	public void inserirusuario(String nome, String pontos) {
		try {
			String query = "INSERT INTO usuario (nome, pontos) VALUES ('" + nome + "' , '" + pontos + "');";
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}
	}

	public void desconectar() {
		try {
			this.connection.close();
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}
	}

	public void inserirusuario(String jogador, int pontuacao) {
		// TODO Auto-generated method stub
		
	}

}
