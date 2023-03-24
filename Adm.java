package application;
import java.util.Locale;
import java.util.Scanner;

public class Adm {
	public static int operacao,senhaadm=0000;
	public static String nome, cpf;
	
	public static void sudosu() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		do {
		System.out.println("Login sudo-su");
		System.out.println("Digite seu nome ");
		nome=sc.nextLine();
		
		System.out.println("Digite seu cpf");
		cpf=sc.next();
		
		System.out.println("Agora digite Sua Senha de administrador ");
		senhaadm=sc.nextInt();
		
		
		if(senhaadm!=0000) {		
			System.out.println("Senha Invalida Tente novamente");
		}
		} while(senhaadm!=0000);
	do {
		System.out.println("___________________________________________");
		System.out.println("|        Seja Bem vindo Sudo SU           |");
		System.out.println("|  Qual operação deseja realizar?         |");
		System.out.println("| [1] Cadastra novo cliente               |");
		System.out.println("| [2] Validar todos os cadastro pendentes |");
		System.out.println("| [3] Verificar saldos                    |");
		System.out.println("| [4] Realiza Deposito Em Uma Conta       |");
		System.out.println("| [5] Sacar De Uma Conta                  |");
		System.out.println("| [6] Fazer Trasferencias                 |");
		System.out.println("| [7] Realiza Emprestimos                 |");
		System.out.println("| [8] Encerrar                            |");
		System.out.println("|_________________________________________|");
		operacao=sc.nextInt();
		switch(operacao) {
		
		case 1:
			Cadastro.novocliente();
			break;
		case 2:
			System.out.println("TODOS OS CADASTROS PENDENTES FORAM VALIDADOS");
			break;
		case 3:	
			TitularC.titular();
			break;
		case 4:
			TitularC.titular();
			break;
		case 5:
			TitularC.titular();
			break;
		case 6:
			TitularC.titular();
			break;
		case 7:
			TitularC.titular();
			break;
		case 8:
			System.out.println("Encerrando Login Do Sudo SU");
			System.out.println("#_#");
			break;
			
			default:
				System.out.println("codigo invalido digite um codigo existente");
		}
	}while(operacao!=8);
		}
	}

