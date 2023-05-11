package Prueba;

public class ParsearDouble{
public static void main(String args[]){
double a = 0, b = 0, suma = 0;
String valor1 = "63.5";
String valor2 = "42.5";
a = Double.parseDouble(valor1);//convierte la cadena a un numero de punto flotante
 b = Double.parseDouble(valor2);
suma = a + b;
System.out.println("La suma es: "+a+" + "+b+" = "+suma);
}
}