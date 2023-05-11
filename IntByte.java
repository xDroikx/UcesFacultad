package Prueba;

public class IntByte{
public static void main(String args[]){
int valor = 386; //este numero es mas grande que el valor decimal que aloja el registro (256)
byte squashed = (byte) valor;
System.out.println("Casteo int a byte: "+squashed);
//el dato byte tiene un rango signado de (-128 a 127) con un registro de 256
//si vemos la tabla de complemento a1 y a2
//el resultado con 127 sera (127) rango de positivos
//el resultado con 128 sera (-128) porque ha pasado el rango de positivos
//el resultado con 255 sera (-1) porque ha pasado el rango
//el resultado con 256 sera (0) porque ha pasado el rango
//el resultado con 257 sera (1) porque ha pasado el rango del registro
//el resultado con 258 sera (2) porque ha pasado el rango
//el resultado con 386 sera (-126) ha pasado el rango dos veces como una circunferencia
}
}
