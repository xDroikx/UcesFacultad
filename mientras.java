package Bucles;
import javax.swing.*;
public class mientras {

	public static void main(String[] args) {
		
		String clave="Juan";
		
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor ");

				if(clave.equals(pass)==false){
					
					System.out.println("Contraseña incorrecta");
					
				}
			
		}
		
		System.out.println("Contraseña correcta");
	}

}
