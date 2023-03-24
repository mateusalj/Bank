package application;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

	private static int senha1=1234, senha2=4321, senha3=3214, senha4=4213, novasenha, cep, tel;
	private static String nomeC, email, dataN;
	private static String  cpf;
	public static int opcao, saque, operacao, encerrar;
	
	public static void novocliente() {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("ok Vamos criar a sua conta ");
		System.out.println("DIGITE SEU NOME...");
		nomeC=sc.next();
		
		System.out.println("digite seu cpf/cnpj");
		cpf=sc.next();
		
		System.out.println("digite sua data de nascimento");
		dataN=sc.next();
		
		System.out.println("digite seu cep");
		cep=sc.nextInt();
		
		System.out.println("digite seu telefone");
		tel=sc.nextInt();
		
		System.out.println("digite seu email");
		email=sc.next();
		
		System.out.println("agora  CRIE SUA SENHA (faça uma senha forte) ");
		novasenha=sc.nextInt();
		
		if (novasenha==senha1 || novasenha==senha2 || novasenha==senha3 || novasenha==senha4) {
				
				System.out.println("Senha ja existe ");
				
		} else {
			System.out.println("Conta cadastrada com sucesso *_* ");
			System.out.println("Faça seu login na tela incial");
		}		
	}

public static String getNomeC() {
	return nomeC;
}

public static void setNomeC(String nomeC) {
	Cadastro.nomeC = nomeC;
}
public static String getCpf() {
	return cpf;
}

public static void setCpf(String cpf) {
	Cadastro.cpf = cpf;
}

public static int getSenha1() {
	return senha1;
}

public static void setSenha1(int senha1) {
	Cadastro.senha1 = senha1;
}

public static int getSenha4() {
	return senha4;
}

public static void setSenha4(int senha4) {
	Cadastro.senha4 = senha4;
}

public static int getSenha2() {
	return senha2;
}

public static void setSenha2(int senha2) {
	Cadastro.senha2 = senha2;
}

public static int getSenha3() {
	return senha3;
}

public static void setSenha3(int senha3) {
	Cadastro.senha3 = senha3;
}

public static int getCep() {
	return cep;
}

public static void setCep(int cep) {
	Cadastro.cep = cep;
}

public static String getDataN() {
	return dataN;
}

public static void setDataN(String dataN) {
	Cadastro.dataN = dataN;
}

public static String getEmail() {
	return email;
}

public static void setEmail(String email) {
	Cadastro.email = email;
}

public static int getTel() {
	return tel;
}

public static void setTel(int tel) {
	Cadastro.tel = tel;
}

}