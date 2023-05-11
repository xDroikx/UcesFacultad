package Bucles;

public class TablaMult {

	public static void main(String[] args) {
		
		int contador=1;
		int acumulador;
		int numero = 3;
		
		System.out.println("Tabla de multiplicar del 3");
		
		while(contador<4){
				acumulador=contador*numero;
				
				System.out.println("3x["+contador+"]"+acumulador);
				
				contador=contador +1;
			
		}

	}

}
