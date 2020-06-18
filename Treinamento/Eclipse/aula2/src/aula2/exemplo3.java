package aula2;

//entrada de dados via combo - Solicitar ao usuario a entrada de dados

import javax.swing.JOptionPane;
public class exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a,b;
	float x,y,res;
	
	a = JOptionPane.showInputDialog("Digite seu primeiro numero");
	x = Float.parseFloat(a);
	
	b = JOptionPane.showInputDialog("Digite seu segundo numero");
	y = Float.parseFloat(b);
	
	//res = (x+y);
	//System.out.print(res);
	
	//JOptionPane.showMessageDialog(null,  "Resultado da soma: " + res);
	
	res = (x-y);
	System.out.print(res);
	
	JOptionPane.showMessageDialog(null,  "Resultado da subtração: " + res);
	
	

	}

}
