package aula2;

import java.util.Scanner;

public class exemplo7 {

	public static void main(String[] args) {
			
		
		int idade;
		//boolean maior = true
		
		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite Sua idade: ");
		idade=ler.nextInt();
		
		if (idade >= 18 && idade <=65) 
		{  
			System.out.print("Eleitor");
		}
			else 
				if (idade < 16)
				{
					System.out.print("Não eleitro");
				}
			
				else
				{
				System.out.print("Facultativo");
			}
			
	}
}

	
		

