package Prueba;

public class Principal2{
String Titulo;
public static void main(String args[]){
Principal lib = new Principal(); //instanciamos la clase
lib.Titulo ="Soy un Programador";
Libro libro = new Libro();
libro.Autor ="soy autor de programacion";
System.out.println(lib.Titulo);
System.out.println(libro.Autor);
}
}
class Libro{ //clase libro externa al metodo principal pero en el mismo fichero notepad
String Autor;
}
