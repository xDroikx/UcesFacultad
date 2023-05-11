
public class Personas{

	
	public String nombre;
	public double altura;
	public int peso;
	public String piel;
	
	
	
	public static void main(String[] args) {
	
		Personas per1 = new Personas();
		
		per1.nombre = "Roberto";
		per1.altura = 1.86;
		per1.peso = 84;
		per1.piel = "Blanco";
	
		Personas per2 = new Personas();
		per2.nombre = "Marcos";
		per2.altura = 1.92;
		per2.peso = 92;
		per2.piel = "Moreno";
		
		
			System.out.println("Su nombre es: "+per1.nombre);
			System.out.println("Su altura es: "+per1.altura);
			System.out.println("Su peso es: "+per1.peso);
			System.out.println("Su piel es:  "+per1.piel);
			System.out.println("\nSu nombre es: "+per2.nombre);
			System.out.println("Su altura es: "+per2.altura);
			System.out.println("Su peso es: "+per2.peso);
			System.out.println("Su piel es:  "+per2.piel);
	}

}
