package Prueba;

public class Caracter{
public static void main(String args[]){//programa principal
char caracter = '@'; //presionar el arroba es presionar el numero 64 decimal
char decimal = 64; //el numero 64 decimal en binario es 01000000
char hexadecimal = 0x0040;
char unicode = '\u0040';
System.out.println("El caracter es: "+caracter);
System.out.println("El caracter en decimal es: "+decimal);
System.out.println("El caracter en hexadecimal es: "+hexadecimal);
System.out.println("Elcaracter en unicode es: "+unicode);
}
}