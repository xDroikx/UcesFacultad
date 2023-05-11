package Bucles;

public class PreincrePost {

	public static void main(String[] args) {
		
		int contadorPre = 0;
		
		int contadorPre1 = ++contadorPre;
		
		int contadorPost=0;
		
		int contadorPost1 = contadorPost++;
		
		System.out.println("["+contadorPre1+"]");
		System.out.println("["+contadorPost1+"]");
	}

}
