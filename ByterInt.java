package Prueba;

public class ByterInt{
public static void main(String args[]){
int numero1 = 32;//declaracion y asignacion de variable
byte numero2;//declaracion de variable
numero2 = (byte) numero1;//hago el casteo a byte del int a byte
 //verifico la longitud del dato en bits. dividido por 8 obtenemos el resultado en bytes
 System.out.println("sizeof(byte) = "+Byte.SIZE+" bits o "+Byte.SIZE/8+" bytes");
System.out.println("casteo de entero a byte: "+numero2);
}
}
