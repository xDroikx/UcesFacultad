package Condicionales;

import javax.swing.JOptionPane;

public class si6 {

	public static void main(String[] args) {
		int horastrabajadas;
		float salariototal;
		
		horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));

		if(horastrabajadas<=40){
			salariototal=horastrabajadas*16;
		}else {
			salariototal=(40*16)+((horastrabajadas-40)*20);
		}
		
		JOptionPane.showMessageDialog(null,"El salario total es: "+salariototal);
		
		
	}

}
