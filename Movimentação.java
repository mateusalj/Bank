package application;
import java.util.Scanner;

public class Movimentação {
	static Scanner sc = new Scanner(System.in);
	public double retirada;
	private static double saldo=200;
	public static double saque;
	public static double tranF;
	private static double deposito, emprestimo;
	public static int opcao, opcaoP, chaveP, depoC, numC, agencia, cpf, tel;
	private static String nomeD, email, chaveA;
	
	public static void Saque(){
		System.out.println("Digite o valor do Saque");
		saque=sc.nextDouble();
		if(saque<=saldo) {
			System.out.println("Realizado saque de " +saque);
		}else {
			System.out.println("Saldo insuficiente para realizar o saque");	
		}
		saldo=saldo-saque;
	}
		
	public static void Saldo(){
		System.out.println("Seu saldo é " + saldo );
	}
	
	public static void Deposito() {
		System.out.println("Deseja realizar deposito para sua propria conta ou para outra conta?");
		System.out.println("[1] Propria conta");
		System.out.println("[2] Outra conta");
		depoC=sc.nextInt();
		if(depoC==2) {
			System.out.println("Digite as informações da conta para deposito");
			System.out.println("Digite o nome completo");
			nomeD=sc.next();
			System.out.println("Digite o numero da conta");
			numC=sc.nextInt();
			System.out.println("Digite a Agencia");
			agencia=sc.nextInt();
			System.out.println("Informe o valor do Deposito:");
			deposito=sc.nextDouble();
			System.out.println("Deposito de "+deposito+ " Realizado com sucesso"+ ", Na conta de \n "+ nomeD + "Agencia \n "+ agencia + "Conta "+ numC);
			System.out.println(" ");
			
		}else {
		System.out.println("Informe o valor do Deposito:");
		deposito=sc.nextDouble();
		System.out.println("Deposito de "+deposito+ " Realizado com sucesso");
		System.out.println(" ");
		saldo=saldo+deposito;
		}	
	}
	
	public static void Transferencia() {
		System.out.println("Tranferencia via Pix");
		System.out.println("selecione a chave Pix");
		System.out.println("[1] CPF");
		System.out.println("[2] E-mail");
		System.out.println("[3] Telefone");
		System.out.println("[4] Chave Aleatoria");
		opcaoP=sc.nextInt();
		switch(opcaoP) {
		case 1:
			System.out.println("Digite a chave Pix");
			cpf=sc.nextInt();
			System.out.println("Quanto deseja transferir?");
			tranF=sc.nextDouble();
			if(tranF<=saldo) {
				System.out.println("Transferencia realizada com sucesso");
				}else {
					System.out.println("Saldo Insuficiente");
				}
				saldo=saldo-tranF;
			break;
		case 2:
			System.out.println("Digite a chave Pix");
			email=sc.next();
			System.out.println("Quanto deseja transferir?");
			tranF=sc.nextDouble();
			if(tranF<=saldo) {
				System.out.println("Transferencia realizada com sucesso");
					
				}else {
					System.out.println("Saldo Insuficiente");
				}
				saldo=saldo-tranF;
			break;
		case 3:
			System.out.println("Digite a chave Pix");
			tel=sc.nextInt();
			System.out.println("Quanto deseja transferir?");
			tranF=sc.nextDouble();
			if(tranF<=saldo) {
				System.out.println("Transferencia realizada com sucesso");
					
				}else {
					System.out.println("Saldo Insuficiente");
				}
				saldo=saldo-tranF;
			break;
		case 4:
			System.out.println("Digite a chave Pix");
			chaveA=sc.next();
			System.out.println("Quanto deseja transferir?");
			tranF=sc.nextDouble();
			if(tranF<=saldo) {
				System.out.println("Transferencia realizada com sucesso");
					
				}else {
					System.out.println("Saldo Insuficiente");
				}
				saldo=saldo-tranF;
			break;
		default:
			System.out.println("Codigo informado errado digite novamente");
		}
	}
	
	public static void Enprestimo(){
		System.out.println("Digite o valor do Emprestimo");
		emprestimo=sc.nextDouble();
		System.out.println("Emprestimo realizado o dinheiro solicitado ja esta na sua conta");
		saldo=saldo+emprestimo;
	}

	public static String getNomeD() {
		return nomeD;
	}

	public static void setNomeD(String nomeD) {
		Movimentação.nomeD = nomeD;
	}

	public static String getEamail() {
		return email;
	}

	public static void setEamail(String eamail) {
		Movimentação.email = eamail;
	}

	public static String getChaveA() {
		return chaveA;
	}

	public static void setChaveA(String chaveA) {
		Movimentação.chaveA = chaveA;
	}
}