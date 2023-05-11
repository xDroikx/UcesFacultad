package Bucles;
import java.util.*;
import java.math.*;
public class mientras2 {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		/*DO*/while(numero!=aleatorio){
			intentos++;
			System.out.println("Introduce un numero");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero){
				
				System.out.println("Mas bajo");
				
			}
			else if(aleatorio>numero){
					
				System.out.println("Mas alto");
					
				}
		
			
			
		}//while(numero!=aleatorio) se coloca aca en caso de DO while
		
		System.out.println("correcto. En " + intentos + " intentos");
	}
	
	
}
