package aula1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int idade;
		String nome,sobrenome;
		
		System.out.print("Digite seu nome: ");
		nome = ler.next();
		
		System.out.print("Digite seu nome: " + nome);
		
		
		System.out.print("Digite seu Sobrenome: ");
		sobrenome = ler.next();
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Seu Nome = " + nome );
		System.out.println("Seu sobrenome = " + sobrenome );
		System.out.println("Sua idade = " + idade );
				
	}
}
