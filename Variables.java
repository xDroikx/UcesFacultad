package Prueba;

public class Variables{ //nombre de la clase
public static String global = " Soy la Variable global "; // Variable Global o de clase
public static void main(String args[]){ //Metodo main o principal
metodo(); //nombre de metodo que llama las variables
//System.out.println(local);//colocando local en otro metodo dara error
//estoy llamando desde otro metodo
}
public static void metodo(){
String local = " Soy la Variable local ";
System.out.println(local); //llamando a variable local
System.out.println(global);//llamando a variable global
}
}
