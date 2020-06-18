package aula2;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {

			String a,s,n;
			float salario=1500;
			float saldo=500;	
			float c,d,e;
			
			a = JOptionPane.showInputDialog("Digite o valor do saque");
			c = Float.parseFloat(a);
			
			if (c > saldo)
			{
				//JOptionPane.showMessageDialog(null,"Saque não autorizado, se saldo atual é: " + saldo );
				s = JOptionPane.showInputDialog("Voce possui emprestimo: " + (salario + (salario * 0.05)) + "\n Deseja resgatar 1 - Sim 2 - Não");
				d = Float.parseFloat(s);	
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Saque autorizado, se saldo atual é: " + (saldo - c) );
			}
	}
}
	

