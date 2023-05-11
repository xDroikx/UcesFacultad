package Prueba;

public class Manga {

	
		public static void main(String[] args){
		
		Camisa1 man=new Camisa1();
		man.descripción= "Manga Corta";
		man.precio=100.00;
		man.color= 'A';
		man.talle=3;
		man.mostrar();
		
		
		Camisa1 va1=new Camisa1 ();//creo otra camisa
		va1.descripción="Manga Larga";//modifico atributos
		va1.precio=130.00;
		va1.color= 'R' ;
		va1.talle= 5 ;
		va1.mostrar();
		 
		
		
		
		}
}