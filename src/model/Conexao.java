package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	private static String server = "jdbc:sqlserver://10.109.8.9:1499;";
	private static String banco = "databaseName=POO_gp01";
	private static String usuario = "user=POO_gp01;password=;encrypt=false;trustServerCertificate\n"
			+ "=true;loginTimeout=30;";
	
	public static Connection conexao; // conecta com o banco 
	
	public static void Conectar() {
		try {
			// conexao com o banco
		conexao = DriverManager.getConnection(server+banco+usuario);
		JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de conexão!\nERRO");
		}
	}
}