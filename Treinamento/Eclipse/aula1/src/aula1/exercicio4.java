package aula1;

import java.util.Scanner;

// exercicio Cota��o Dolar

public class exercicio4 {

	public static void main(String[] args) {
		
			
		double cot;
		double dols;
		double val;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a cota��o do dolar:");
		cot = ler.nextDouble();
							
		System.out.println("Digite quantos dolares:");			
		dols = ler.nextDouble();
					
		val = cot * dols;
				
		System.out.println("Valor em reais : R$ "  + val );	
		
	}

}
