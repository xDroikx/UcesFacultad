package Condicionales;
import java.util.*;
public class si2 {

	public static void main(String[] args) {
	
	
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if(edad<18){ //condicion si
			
			System.out.println("Eres adolecente");
			
		}
		else if(edad<40){ //si no se cumple la primera condicion pasa a esta
			
			System.out.println("Eres joven");
			
		}
		else if(edad<65){ //si no se cumple la primera condicion pasa a esta
			
			System.out.println("Eres mayor");
			
		}
		else{ //si no se cumple la primera condicion pasa a esta
			
			System.out.println("Eres viejo");
			
		}
	}	
}
