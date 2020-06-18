package aula2;

import java.util.Scanner;

public class exercicio3 {
public static void main(String[] args) {
	
	System.out.println("|=====================================|");
	System.out.println("|   Calculadora Banco Cris S.A        |");
	System.out.println("|             MENU                    |");
	System.out.println("| 1 - Somar                           |");
	System.out.println("| 2 - Subtrair                        |");
	System.out.println("| 3 - Multiplicar                     |");
	System.out.println("| 4 - Dividir                         |");
	System.out.println("|                                     |");
	System.out.println("|=====================================|");
	
	double n1;
	double n2;
	int opc;
	//string 1;
	//String 2;1
	//String 3;
	//String 4;
	float a,b;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.print(" Opcao ");
	opc=ler.nextInt();
		
	if (opc == 1) {
		System.out.print("Digite primeiro numero");
		n1=ler.nextDouble();
		
		System.out.print("Digite segunda numero");
		n2=ler.nextDouble();
		System.out.print(n1 + n2);      

	}
	else if  (opc == 2) {
		System.out.print("Digite primeiro numero");
		n1=ler.nextDouble();
		
		System.out.print("Digite segunda numero");
		n2=ler.nextDouble();
		System.out.print(n1 - n2);      

	}
	else if (opc == 3) {
		System.out.print("Digite primeiro numero");
		n1=ler.nextDouble();
		
		System.out.print("Digite segunda numero");
		n2=ler.nextDouble();
		System.out.print(n1 * n2);      

	}
	else if (opc == 4) {
		System.out.print("Digite primeiro numero");
		n1=ler.nextDouble();
		
		System.out.print("Digite segunda numero");
		n2=ler.nextDouble();
		System.out.print(n1 / n2);      
	}
	
	else
	{System.out.print("Opção invalida");

	}
}

}