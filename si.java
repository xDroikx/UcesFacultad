package Condicionales;
import java.util.*;
public class si {

	public static void main(String[] args) {
	
	
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if(edad>=18){ //condicion si
			
			System.out.println("Eres mayor de edad");
			
		}
		else { //si no se cumple la primera condicion pasa a esta
			
			System.out.println("Eres menor de edad");
			
		}
	}		
}
