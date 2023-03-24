package application;
import java.util.Locale;
import java.util.Scanner;

public class TitularC {
	private static int senha, senha1=1234, senha2=4321, senha3=3214, senha4=4213, novasenha, cep, tel;
	private static String nomeC, email, dataN, cpf;
	public static int opcao, saque, operacao, encerrar;
	
public static void titular() {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Movimentação mov = new Movimentação();

	System.out.println("DIGITE SEU NOME...");
	nomeC=sc.next();
	System.out.println("Informe sua senha");
	senha=sc.nextInt();
		
	if(senha==senha1 ||senha==senha2 || senha==senha3 ||senha==senha4 || senha==novasenha){
		do {
			System.out.println("__________________________________");
			System.out.println("|  Qual operação deseja realizar?|");
			System.out.println("| [1] Verificar Saldo            |");
			System.out.println("| [2] Realizar Saque             |");
			System.out.println("| [3] Realizar Deposito          |");
			System.out.println("| [4] Realizar Tranferencia      |");
			System.out.println("| [5] Realizar Empréstimo        |");
			System.out.println("| [0] encerrar                   |");
			System.out.println("|________________________________|");
			operacao=sc.nextInt();
			
			switch(operacao){
				case 1: 		
					Movimentação.Saldo();
				break;
				
				case 2:
					Movimentação.Saque();
				break;
				
				case 3:
					Movimentação.Deposito();
				break;
				
				case 4:
					Movimentação.Transferencia();
				break;
				
				case 5:
					Movimentação.Enprestimo();
				break;
				
				case 0:
					System.out.println("Operação encerrada");
				break;	
			
				default:
					System.out.println("Codigo informado errado digite novamente");
			}		
		}while(operacao!=0);
			Progam.main(null);

			sc.close();
		}else System.out.println("Senha invalida Voltando ao menu inicial"+"\r");		
		}

		
		public static String getNomeC() {
			return nomeC;
		}

		public static void setNomeC(String nomeC) {
			TitularC.nomeC = nomeC;
		}
		public static String getCpf() {
			return cpf;
		}

		public static void setCpf(String cpf) {
			TitularC.cpf = cpf;
		}

		public static int getSenha1() {
			return senha1;
		}

		public static void setSenha1(int senha1) {
			TitularC.senha1 = senha1;
		}

		public static int getSenha4() {
			return senha4;
		}

		public static void setSenha4(int senha4) {
			TitularC.senha4 = senha4;
		}

		public static int getSenha2() {
			return senha2;
		}

		public static void setSenha2(int senha2) {
			TitularC.senha2 = senha2;
		}

		public static int getSenha3() {
			return senha3;
		}

		public static void setSenha3(int senha3) {
			TitularC.senha3 = senha3;
		}

		public static int getCep() {
			return cep;
		}

		public static void setCep(int cep) {
			TitularC.cep = cep;
		}

		public static String getDataN() {
			return dataN;
		}

		public static void setDataN(String dataN) {
			TitularC.dataN = dataN;
		}

		public static String getEmail() {
			return email;
		}

		public static void setEmail(String email) {
			TitularC.email = email;
		}

		public static int getTel() {
			return tel;
		}

		public static void setTel(int tel) {
			TitularC.tel = tel;
		}

	}