package Concessionaria;

import java.sql.Connection;
import java.sql.DriverManager;

class ConexaoMySQL {
    public static String url = "jdbc:mysql://localhost:3306/concessionaria";
	public static String user = "root";
	public static String password = "positivo";
	static Connection instance = null;
	
	private ConexaoMySQL(){
		
	}
	static Connection getInstance() {
		if(instance == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(url,user,password);
				//System.out.println(conn.isValid(0));
				ConexaoMySQL.instance = conn;
			}catch(Exception e) {
				System.out.println("Errou dnv");
				e.printStackTrace();
			}
		}
		return instance;
	}

}
/*
//Singleton


	import java.sql.SQLException;

	public class ConexaoMySQL {
		
		public static String status = "Não conectou...";
			
		static String url= "jdbc:mysql://LocalHost:3306/concessionaria";
		static String user = "root";
		static String senha = "positivo";
			
		static Connection conexao;
		//Método Construtor da Classe//

		private ConexaoMySQL() {}	
		//==========================================================================//	 
		static Connection getInstance() {		
		try {
				
			if (conexao == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexao = DriverManager.getConnection(url, user, senha);
				status = ("STATUS--->Conectado com sucesso!");
				}
				return conexao;	
			} catch (ClassNotFoundException e) {  
				//Driver não encontrado
				System.out.println("O driver expecificado nao foi encontrado.");
				return null;				
			} catch (SQLException e) {
				//Não conseguindo se conectar ao banco
				System.out.println("Nao foi possivel conectar ao Banco de Dados.");
				return null;
				}					
			}			
		//==========================================================================//
			

		//Método que retorna o status da sua conexão//

		   public static String statusConection() {

		       return status;

		   }

		//==========================================================================//

		//Método que fecha sua conexão//

		   public static boolean FecharConexao() {

		     try {

		        if(conexao != null) {
		        	conexao.close();
		          }

		          return true;

		      } catch (SQLException e) {

		           return false;

		      }
	}
		   
	//==========================================================================//
	}

*/