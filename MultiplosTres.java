package Bucles;

public class MultiplosTres {

	public static void main(String[] args) {
		
		int multiplo = 3;
		int numero= 10;
		int acum=0;
		int contador =0;
		
		System.out.println("He ingresado un multiplo: "+multiplo);
		
		while (contador<numero){
			acum=acum+multiplo;
			++contador;
			System.out.println("Multiplo de 3: ["+contador+"]="+acum);
		}

	}

}
