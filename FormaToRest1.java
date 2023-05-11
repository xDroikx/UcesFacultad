package Condicionales;
import java.util.*;
public class FormaToRest1 {

	public static void main(String[] args) {
		
		int n = 2813;
		double e = 12.3698;
		String total = "hola mundo"; 
		System.out.printf("En hexadecimal es: %x \nEn string es: %s \nEn octal es: %o\n",n,n,n);
		
		System.out.printf("con flotante es %.7f %n",e); // "%n" es un salto de lineo como "\n"
		System.out.printf("como entero es %12d %n",n); // "si colocas un numero entre "%d" suman espacios segun el numero que pongas                             
		System.out.printf("como string es %s %n",e);
		System.out.printf("como entero es %05d %n",n);
		System.out.printf("La cadena de caracteres es: %15s", total);
		
	}

}
