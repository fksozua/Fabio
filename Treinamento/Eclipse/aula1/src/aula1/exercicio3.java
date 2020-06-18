package aula1;

import java.util.Scanner;

// exercicio KM

public class exercicio3 {

	public static void main(String[] args) {
		
			
		double sal;
		double vend;
		double com;
		double salario;
		String nome;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor:");
		nome = ler.next();
							
		System.out.println("Digite o salario fixo:");			
		sal = ler.nextInt();
		
		System.out.println("Total de vendas:");			
		vend = ler.nextInt();
		
		com = vend * 0.15;
		salario = sal + com;
		
		
		System.out.println("Vendedor : " + nome + "\n" +  "Salario :" + salario );	
		
	}

}