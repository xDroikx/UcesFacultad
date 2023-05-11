package Bucles;

public class WhileAcunP {

	public static void main(String[] args) {
		
		int contador = 0;
		int acumulador= 0;
		
		while(contador<5) {
			
			contador=contador+1;
			
			acumulador=acumulador+contador;
			System.out.println("contador"+contador+"acumulador"+acumulador);
			
		}
			System.out.println("");
			System.out.println("La suma de los"+contador+"numero es:"+acumulador);
	}

}
