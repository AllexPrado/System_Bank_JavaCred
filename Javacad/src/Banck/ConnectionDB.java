package Banck;

//Classes necessárias para uso de Banco de dados //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



//Início da classe de conexão//

public class ConnectionDB {

           public static String status = "Não conectou...";

//Método Construtor da Classe//

      public ConnectionDB() {

  }



//Método de Conexão//

public static Connection getConexaoSQLServer() throws SQLException {

      Connection connection = null;          //atributo do tipo Connection



try {

//Carregando o JDBC Driver padrão

String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

Class.forName(driverName);



//Configurando a nossa conexão com um banco de dados//

			String serverName = "localhost";    //caminho do servidor do BD
			
			String databaseName = "JAVACARD";
			
			String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;
			
			String username = "sa";        //nome de um usuário de seu BD
			
			String password = "Mc@33598600";      //sua senha de acesso
			
			connection = DriverManager.getConnection(url, username, password);



      //Testa sua conexão//

      if (connection != null) {

          status = ("STATUS--->Conectado com sucesso!");

      } else {

          status = ("STATUS--->Não foi possivel realizar conexão");

      }



      return connection;



      } catch (ClassNotFoundException e) {  //Driver não encontrado



          System.out.println("O driver expecificado nao foi encontrado.");

          throw new SQLException("Driver não encontrado", e);

      } catch (SQLException e) {

//Não conseguindo se conectar ao banco

          System.out.println("Nao foi possivel conectar ao Banco de Dados.");

          throw e;

      }



  }



  //Método que retorna o status da sua conexão//

  public static String statusConection() {

      return status;

  }



 //Método que fecha sua conexão//

  public static boolean FecharConexao() {

      try {

          ConnectionDB.getConexaoSQLServer().close();

          return true;

      } catch (SQLException e) {

          return false;

      }



  }



 //Método que reinicia sua conexão//

  public static java.sql.Connection ReiniciarConexao() throws SQLException {

      FecharConexao();



      return ConnectionDB.getConexaoSQLServer();

  }



public static Connection getConnection() throws SQLException {
	// TODO Auto-generated method stub
	return ConnectionDB.getConexaoSQLServer();
}         
  
}