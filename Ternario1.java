package Bucles;

public class Ternario1 {

	public static void main(String[] args) {
		
		
		int cantidad =10;
		int buscamos = 11;
		String total="";
		
		total = (buscamos >cantidad) ? "cantidad alta" +buscamos : "cantidad baja"+ cantidad;
		
		System.out.println(total);
	}

}
