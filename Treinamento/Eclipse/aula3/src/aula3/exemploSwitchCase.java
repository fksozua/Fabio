package aula3;

import java.util.Scanner;

public class exemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Digite o m�s em numero inteiro (Entre 1 at� 4)");
		opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
			
		default:
			System.out.println("ERRO, digite somente numero entre 1 e 4");
			break;
		}

	}

}
