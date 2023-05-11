package Bucles;
import java.util.Scanner;
public class ScaneoTeclado {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String nombre;
		double radio;
		float radio1;
		int n;
		
		System.out.println("Introduzca su nombre ");
		nombre = sc.nextLine();
		System.out.println("Hola "+nombre+"!!!");
		
		System.out.println("Introduzca el radio de la circunferencia ");
		radio = sc.nextDouble();
		System.out.println("Longitud de la circunferencia en double "+2*Math.PI*radio);

		System.out.println("Introduzca el radio de la circunferencia ");
		n = sc.nextInt();
		System.out.println("El cuadrado es: "+Math.pow(n,2));
		
		System.out.println("Introduzca la circunferencia ");
		radio1 = sc.nextFloat();
		System.out.println("Longitud de la circunferencia en float: "+2*Math.PI*radio1);
		
		
		
	}

}
