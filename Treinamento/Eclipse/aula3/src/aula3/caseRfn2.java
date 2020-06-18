package aula3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class caseRfn2 {

	public static void main(String[] args) {


			System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("<<<<<<<<<CAIXA ELETRÔNICO>>>>>>>>>>>>>");
			System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("--------------------------------------");
			System.out.println("<<< 1 - Extrato >>>            ");
			System.out.println("<<< 2 - Sacar >>>              ");
			System.out.println("<<< 3 - Depositar >>>          ");
			System.out.println("<<< 4 - Sair >>>          ");
			
			Scanner ler = new Scanner(System.in);
			
			int opcao, conta=8565;
			double saldo=1000.00;
			double sacar;
			float sac;
			
			
			System.out.println("\n Opção: ");
			opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Extrato");
				System.out.println("Nome: Fabio");
				System.out.println("Numero da conta: " + conta);
				System.out.println("Saldo atual:" + saldo);
				System.out.println("Saques realizados hoje: 0");
				break;
			case 2:
				System.out.print("Digite o valor do saque: ");
				sacar=ler.nextDouble();
				
				if (sacar > saldo)
				{
					System.out.print ("Voce nao possui saldo:");	
				}
				else
				{
					System.out.println("Saque autorizado, se saldo atual é: " + (saldo - sacar) );
				}
		}
				break;
			case 3:
				System.out.println("Depositar");
				break;
			case 4:
				System.out.println("Sair");
				break;
				
			default:
				System.out.println();
				break;*/
}
}

