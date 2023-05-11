package Bucles;

public class WhileInfinito {

	public static void main(String[] args) {
		
		int contador = 0;
		boolean comparador = contador < 10;
		
		while(comparador){
			
			System.out.println("La iteracion es infinita["+contador+"]");
			
			contador++;
		}

	}

}
