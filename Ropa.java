
public class Ropa{

	
		public String tipo; 
		public String color;
		public double precio;
		public int talle;
		
		
		
		public static void main(String[] args) {
		
		Ropa rem1 = new Ropa();
		rem1.tipo = "Camisa";
		rem1.color = "roja";
		rem1.precio = 59.99;
		rem1.talle = 6;
		
		Ropa cam1 = new Ropa();
		cam1.tipo = "Remera";
		cam1.color = "Azul";
		cam1.precio = 79.99;
		cam1.talle = 5;
	
			System.out.println("Item descripcion: "+rem1.tipo);
			System.out.println("Color codigo: "+rem1.color);
			System.out.println("Item precio: "+rem1.precio);
			System.out.println("Item talle: "+rem1.talle);
			
			System.out.println("\nItem descripcion: "+cam1.tipo);
			System.out.println("Color codigo: "+cam1.color);
			System.out.println("Item precio: "+cam1.precio);
			System.out.println("Item talle: "+cam1.talle);
		
		
		
		
		
		}
		
		
		
}		
