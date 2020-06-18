package aula2;

import java.util.Scanner;

public class exemplo9 {

	// Estado civil
	public static void main(String[] args) {
		
		String loginUser="Fabio";
		String senhaUser="123";

		Scanner in = new Scanner(System.in);
		
		System.out.println("|=================================|");
		//Infomre o seu login
		System.out.println("Digite seu login");
		String login = in.nextLine();
		//Infomre a sua senha
		System.out.println("Digite sua senha");
		String  senha = in.nextLine();
		System.out.println("|=================================|");
		
		if(login.equals(loginUser) && senha.contentEquals(senhaUser)) {
			System.out.printf("Usuario %s logado com sucesso!", login);
		}
		else {
			System.out.println("Login ou senha invalidos!");
		}
	}

}
