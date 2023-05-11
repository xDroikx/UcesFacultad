package Bucles;
import java.util.Scanner;
public class WhileProm {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int total= 0;
		int numero;
		int promedio;
		int contador=0;
		
		while(contador<10) {
			
			System.out.println("introduce un numero: ");
			
			numero=input.nextInt();
			
			total=total+numero;
			
			contador++;
			
			
			
		}
		promedio=total/10;
		
		System.out.println("su promedio es:  "+promedio);
		
	}

}
