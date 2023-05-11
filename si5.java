package Condicionales;
import javax.swing.JOptionPane;
public class si5 {

	public static void main(String[] args) {
		char letra;
		letra=JOptionPane.showInputDialog("Digite una letra").charAt(0);

		if(Character.isUpperCase(letra)){
			JOptionPane.showMessageDialog(null,"Es mayuscula");
		}else{
			JOptionPane.showMessageDialog(null,"No es mayuscula");
			
		}
		
		
		
	}

}
