package Bucles;

public class MultiploRestoWhile {

	public static void main(String[] args) {
	
			int contador =1;
			int n= 144;
			int resto;
			
			while(contador<n){
				
				if((resto=contador%3)==0){
					System.out.println("si es multiplo de 3 de 1 a"+n+":["+contador+"]=resto"+resto);
				}else if ((resto=contador %3)!=0){
					
					System.out.println("no es multiplo de 3 de 1 a"+n+":["+contador+"]=resto"+resto);
				}
			}

	}

}
