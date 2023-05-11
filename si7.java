package Condicionales;

import javax.swing.JOptionPane;

public class si7 {

	public static void main(String[] args) {
		int a,b,c;

		a=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		if((a>b)&&(b>c)){
			JOptionPane.showMessageDialog(null,"orden "+a+" - "+b+" - "+c);
		}else if((a>c)&&(c>b)){
			JOptionPane.showMessageDialog(null,"orden "+a+" - "+c+" - "+b);
		}else if((b>a)&&(a>c)){
			JOptionPane.showMessageDialog(null,"orden "+b+" - "+a+" - "+c);
		}else if((b>c)&&(c>a)){
			JOptionPane.showMessageDialog(null,"orden "+b+" - "+c+" - "+a);
		}else if((c>a)&&(a>b)){
			JOptionPane.showMessageDialog(null,"orden "+c+" - "+a+" - "+b);
		}else{
			JOptionPane.showMessageDialog(null,"orden "+c+" - "+b+" - "+a);
		}
		
		
	}

}
