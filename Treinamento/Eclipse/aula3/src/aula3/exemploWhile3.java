package aula3;

import java.util.Scanner;

public class exemploWhile3 {

	public static void main(String[] args) {
		String aluno;
		double n1, n2, media=0,res=0, x=0, mediaAlunos=0;
		
		Scanner ler = new Scanner(System.in);
			
		while (mediaAlunos<20) {
						
			System.out.println(" Digite o nome do aluno = ");
			aluno=ler.next();
			System.out.println(" Digite a primeira nota = ");
			n1=ler.nextInt();
			System.out.println(" Digite a segunda nota = ");
			n2=ler.nextInt();	
			
			media = (n1+n2)/2;
			x++;
			mediaAlunos = mediaAlunos + media;
			res = mediaAlunos / x;
		}
		{
			System.out.println("Media de Notas" + res + "\n alunos" + x);
			
		}

	}

}
