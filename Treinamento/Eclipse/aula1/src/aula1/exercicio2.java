package aula1;

import java.util.Scanner;

// exercicio KM

public class exercicio2 {

	public static void main(String[] args) {
		
			
		int dist;
		int lit;
		int cons;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a distancia:");
		dist = ler.nextInt();
		
		System.out.println("Digite litros de combustivel:");			
		lit = ler.nextInt();
		
		cons = (dist / lit);
		System.out.println("Consumo :" + cons + " Km por litro");	
		
	}

}
