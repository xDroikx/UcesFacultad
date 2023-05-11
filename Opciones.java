package Condicionales;
import java.util.*;
import javax.swing.*;
public class Opciones {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Elige una opcion: \n1: Cuadrado \n2: Retangulo \n3: Triangulo \n4: Circulo");
		
	int figura=entrada.nextInt();
	
	switch (figura){
	
	case 1:
		
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
	
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			
			break;
			
	case 2:		
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es " + base*altura);
			
			break;
	
	case 3:
		
			int base2=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura2=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es " + (base2*altura2)/2);
			
			break;
	
	case 4:	
		
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.println("El area del circulo es ");
			
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			
			break;
	}
			
	}
}
