package Condicionales;

import javax.swing.JOptionPane;

public class Opciones3 {

	public static void main(String[] args) {
		int numero1,numero2,suma,resta,mult,div;
		char operaciones;
		
		numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		operaciones=JOptionPane.showInputDialog("Digite un numero").charAt(0);
		
		switch(operaciones) {
		
		case 's':
		case 'S': suma= numero1+numero2;
				  JOptionPane.showMessageDialog(null,"Digite un numero"+suma);
				  break;
		case 'r':
		case 'R': resta= numero1-numero2;
				  JOptionPane.showMessageDialog(null,"Digite un numero"+resta);
				  break;
		case 'm':
		case 'M': mult= numero1*numero2;
				  JOptionPane.showMessageDialog(null,"Digite un numero"+mult);
				  break;
		case 'd':
		case 'D': div= numero1/numero2;
				  JOptionPane.showMessageDialog(null,"Digite un numero"+div);
				  break;
				  
		default:  JOptionPane.showMessageDialog(null,"bye");
		break;
		
		
		
		
		
		}
		

	}

}
