package aula2;

import java.util.Scanner;


public class exemplo5 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.print("Digite seu nome: ");
		nome=ler.next();
		
		System.out.print("Digite Sua idade: ");
		idade=ler.nextInt();
		
		if (idade>=18) {
			System.out.print("Maior de idade");
		}
		else 
		{
			System.out.print("Menor de idade");
		}
		

	}

}