package Banck;



import java.sql.SQLException;
import java.util.Scanner;

public class Index {

    
	public static void main(String[] args) throws SQLException {
      
        ContaBancaria conta = new ContaBancaria();
        ConnectionDB.getConnection();
        
        try (Scanner entrada = new Scanner(System.in)) {
			int numero;
			//while(entrada.hasNextInt()) {	
   do 
   {
   System.out.println("----------------$$$$---------------");
   System.out.println("-------------BANCK-----------");
   System.out.println("1-ABERTURA DE CONTA");
   System.out.println("2-OPERAR CONTA");
   System.out.println("3-LISTAR CONTAS");
   System.out.println("4-ENCERRAR CONTA");
   System.out.println("5-SAIR DO SISTEMA");
   
   
   numero = entrada.nextInt();
   switch (numero) 
   {
			case 1:
			   conta.abrirConta();
			   break;
      
			case 2:
			   conta.operarConta();
			break;
			    
			case 3:
			   conta.listarContas();
			break;
			
			case 4:
			   conta.encerrarConta();
			break;        

			default:
			    System.out.println("Opção inválida. Tente novamente.");
			    break;        

			    }
   		entrada.nextLine();
			}
   while (numero != 5);
   
		}catch (Exception e) {
           // System.err.println("Erro inesperado: " + e.getMessage());
        }
         }
}
    