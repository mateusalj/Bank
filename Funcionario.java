package application;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static int operacao,senhaF=0001,cpf;
	public static String nome;
		

	public static void funcionario() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Login Funcionario");
		System.out.println("Digite seu nome ");
		nome=sc.nextLine();
		
		System.out.println("Digite seu cpf");
		cpf=sc.nextInt();
		
		System.out.println("Agora digite Sua Senha de administrador ");
		senhaF=sc.nextInt();
		
		
		if(senhaF != 0001) {		
			System.out.println("Senha Invalida Tente novamente");
		}
		} while(senhaF != 0001);
	do {
		System.out.println("___________________________________________");
		System.out.println("|        Seja Bem vindo Funcionario       |");
		System.out.println("|  Qual operação deseja realizar?         |");
		System.out.println("| [1] Cadastra novo cliente               |");
		System.out.println("| [2] Validar todos os cadastro pendentes |");
		System.out.println("| [3] Encerrar                            |");
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
			System.out.println("Encerrando Login Funcionario");
			System.out.println("+_+");
			break;
			default:
				System.out.println("codigo invalido digite um codigo existente");
		}
	}while(operacao!=3);
		}

	}
