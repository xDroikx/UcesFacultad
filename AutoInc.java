package Prueba;

public class AutoInc{
	public static String global =("hola soy la variable global");
	public static void main(String[] args){
	int i = 1;
	prt("i : " + i);
	prt("pre-incremento ++i: " + ++i); // Pre-Incremento
	prt("post-incremento i++: " + i++); // Post-Incremento
	prt("i : " + i);
	prt("pre-incremento --i: " + --i); // Pre-Decremento
	prt("post-incremento i--: " + i--); // Post-Decremento
	prt("i : " + i);
	System.out.println(global); 
	String Local =("soy la variable local ");
	System.out.println(Local);
	}
	 // Metodo para Impresion
	 static void prt(String s) {
		 
		 System.out.println(s);
	 }
	}
