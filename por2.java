package Bucles;
import javax.swing.JOptionPane;//solo el JOptionPane el "*" es para toda la libreria de ese tipo
public class por2 {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0;i<mail.length();i++) {
		
			if(mail.charAt(i)=='@') {
				
				arroba=true;
			}
		

	}

		if(arroba==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}
}
}