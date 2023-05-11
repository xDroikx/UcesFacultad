package Prueba;

public class Casting{
public static void main(String args[]){
int dividendo = 5;
int divisor = 2;
//double cociente = dividendo/divisor;//dara 2.0 y no 2.5
double cociente = (double)dividendo/(double)divisor;//con este dara 2.5
System.out.println("El cociente es: "+cociente);
}
}
