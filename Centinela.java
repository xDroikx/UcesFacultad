package Bucles;
import java.util.Scanner;
public class Centinela {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int centinela=-1;
		int suma=0,cuenta=0;
		System.out.println("Introduzca primera nota");
		
		int nota = entrada.nextInt();
		
		while(nota!=centinela){
			
			cuenta++;
			
			suma=suma+nota;
			
			System.out.println("Introduzca siguiente nota: ");
			
			nota= entrada.nextInt();
		}
		
		System.out.println("Final ");

	}

}
