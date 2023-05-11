package Parcial;
public class Main {
	public static String global= ("Aca presentamos los monstruos: ");
	public static void main(String args[]) {
		System.out.println (global);
		
		Monstruos mon1 = new Monstruos();
		
		mon1.nombre= "Dracula";
		mon1.especie="Vampiro";
		mon1.dientes="50";
		mon1.nivel=30;
		mon1.altura=1.63;
		mon1.peso=125;
		mon1.mostrar();
		
		Monstruos mon2 = new Monstruos();
		
		mon2.nombre= "Roberto";
		mon2.especie="Hombre Lobo";
		mon2.dientes="90";
		mon2.nivel=50;
		mon2.altura=1.98;
		mon2.peso=170;
		mon2.mostrar();
		
		
	    double pesototal=(double)mon1.peso+(double)mon2.peso;
	    System.out.println("El peso total de los monstruos es " + pesototal);
		int alturatotal=(int)mon1.altura+(int)mon2.altura;
		System.out.println("La altura total de los monstruos es " + alturatotal);
		int dientestotal=Integer.parseInt(mon1.dientes)+Integer.parseInt(mon2.dientes);
		System.out.println("La cantidad de dientes totales es " + dientestotal);
		String niveltotal=Integer.toString(mon1.nivel)+Integer.toString(mon2.nivel);// el numero es 3050 por que al ser dos string se suman como texto osea 30 + 50 serian 3050 
		System.out.println("El nivel total es " + niveltotal);
		
		String local = "aca finaliza la presentacion";
		System.out.println(local);
		
	
	
	}	
}
