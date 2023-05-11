package Prueba;

public class Persona{
public String varpublica; //modificador public con solo String funciona
public static void main(String args[]){ //programa principal main
Persona per = new Persona(); //instanciacion de la clase
per.varpublica = "hola mundo";
System.out.println("Mi 1era frase es: "+per.varpublica);
}
}
