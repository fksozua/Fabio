package aula3;

import java.util.Scanner;

public class exemploFor4 {

	public static void main(String[] args) {
		
		String aluno;
		double n1, n2, media;
		
		for (int i=1;i<=2;i++) {	
			
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite o nome do aluno = ");
		aluno=ler.next();
		System.out.println(" Digite a primeira nota = ");
		n1=ler.nextInt();
		System.out.println(" Digite a segunda nota = ");
		n2=ler.nextInt();	
		media = (n1+n2)/2;
		
		System.out.println("\n Aluno = " + aluno + "" + " \n Media = " + media);
		}
	}

}
