package Bucles;

public class WhileControlPre {

	public static void main(String[] args) {
		
		int contador = 0 ;
		int salida = 0;
		
		while (contador < 8) {
			
			System.out.println("La iteraciones: ["+contador+"]");
			
			contador = contador +1;
			salida = contador ;
					
		}
		
		System.out.println("La iteracion externa: [" + salida +"]");
		
	}

}
