package Prueba;

public class ParsearEntero{ //carpeta ejercicios-clase
public static void main(String args[]){
int a = 0, b = 0, suma = 0;
String valor1 = "63";
String valor2 = "42";
a = Integer.parseInt(valor1); //convierte la cadena a un numero entero
 b = Integer.parseInt(valor2);
suma = a + b;
System.out.println("La suma es: "+a+" + "+b+" = "+suma);
}
}
