package Bucles;

public class WhileControlPost {

	public static void main(String[] args) {
		
		int contador = 0 ;
		int salida = 0;
		
		while(contador < 0){
			
			System.out.println("La iteracion es: [" + contador + "]");
			
			salida = contador;
			contador = contador + 1;
		}
		System.out.println("la iteracion externa: [" + salida + "]");
	}

}
