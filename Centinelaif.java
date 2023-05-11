package Bucles;

import java.util.Scanner;

public class Centinelaif {

	public static void main(String[] args) {
		int cont = 0;
		final int centinela= -1;
		int acum=0;
		int nota=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una nota" );
		
		while(cont<5){
			System.out.println("Introduzca la nota ["+(cont+1)+"]:" );
			nota=sc.nextInt();
			acum=acum+nota;
			
			if(nota==centinela){
				
				break;
			}
			++cont;
			
		}
			System.out.println("la nota final es "+acum);
	}

}
