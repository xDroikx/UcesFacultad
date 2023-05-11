package Bucles;
import javax.swing.*;
public class por4 {

	public static void main(String[] args) {
		
		Long resultado=1L;
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i =num;i>0;i--){
			
			resultado=resultado*i;
		}
		
		System.out.println("El factorial de "+num+" es "+resultado);

	}

}
