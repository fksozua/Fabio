package aula3;

import java.util.Scanner;

public class exemploWhile5 {

	public static void main(String[] args) {
		int numero;
		int x=0;
		int res;
		
		Scanner ler = new Scanner(System.in);
		System.out.print(" Digite o nome do aluno = ");
		numero=ler.nextInt();
		
		
		while (x<=10) {
			res = (numero * x);
			System.out.println(numero + " x " + x + " = " + res );
			x++;
		}

	}

}
