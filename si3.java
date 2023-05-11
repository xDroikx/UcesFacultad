package Condicionales;

import javax.swing.JOptionPane;

public class si3 {

	public static void main(String[] args) {
		int numero,dato = 5;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

		if(numero>dato){
			JOptionPane.showMessageDialog(null,"El numero es mayor a 5");
			
		}else{
			
		
			JOptionPane.showMessageDialog(null,"El numero es menor a 5");
		 }
		
		
	}

}
