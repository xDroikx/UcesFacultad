package Bucles;

public class MultiploRestoIf{

	public static void main(String[] args){
		
		int dividendo=144;
		int divisor=3;
		int resto;
		
		if((resto=dividendo %divisor)==0){
			System.out.println("son multiplos resto: "+resto);
				
		}else{
			System.out.println("No son multiplos resto: "+resto);
		}

	}

}
