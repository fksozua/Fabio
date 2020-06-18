package aula2;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		String a,b;
		float c,d;
		
		
		a = JOptionPane.showInputDialog("Digite seu primeiro numero");
		c = Float.parseFloat(a);

		b = JOptionPane.showInputDialog("Digite seu segundo numero");
		d = Float.parseFloat(b);
		
		if (c < d) 
		{
			JOptionPane.showMessageDialog(null,c);	
		}
		else
			JOptionPane.showMessageDialog(null,d);	
		}
}
