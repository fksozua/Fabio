package aula2;

import java.util.Scanner;

// if e else

public class exemplo4 {

	public static void main(String[] args) {
		
		double nota1,nota2,media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite Sua Note 1: ");
		nota1=ler.nextDouble();
		
		System.out.print("Digite Sua Note 2: ");
		nota2=ler.nextDouble();

		media = (nota1+nota2)/2;
		
		System.out.println(media);
		
		if (media>=7) 
		{		
			System.out.print("Aprovado");		
		}
		else
		{
			System.out.print("Reprovado");
		}
	}
}
