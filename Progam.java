package application;
import java.util.Locale;
import java.util.Scanner;


public class Progam {
	public static int login;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       do {
        System.out.println("________________________________________________________");
        System.out.println("|  LOGIN                                               |");
        System.out.println("| Desejar Realizar login como ADM ou Titular da conta? |");
        System.out.println("| [1] ADM                                              |");
        System.out.println("| [2] Funcionario                                      |");
        System.out.println("| [3] Titular da Conta                                 |");
        System.out.println("| [4] Cadastrar novo usuario                           |");
        System.out.println("| [0] Encerrar                                         |");
        System.out.println("|______________________________________________________|");
        System.out.println(" ");
        login=sc.nextInt();
        
        if(login==1) {
        	Adm.sudosu();	
        }
        if(login==2) {
        	Funcionario.funcionario();
        }
        if(login==3) {
        	TitularC.titular();
       }
       if(login==4) {
    	   Cadastro.novocliente();
	   }
	
       }while(login!=0);
       		System.out.println("Encerrado");
       }
}