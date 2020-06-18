package aula1;

import java.util.Scanner;

// exercicio Rendimento Poupança

public class exercicio5 {

	public static void main(String[] args) {
		
			
		double depos;
		double juros;
		double val;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor do deposito:");
		depos = ler.nextDouble();
							
		juros = depos + (0.07 * depos);
				
		System.out.println("Valor com juros a.m : R$ "  + juros );	
		
	}

}
