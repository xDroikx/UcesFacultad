package Condicionales;
import javax.swing.JOptionPane;
public class si9 {

	public static void main(String[] args) {
		final int saldo = 1000;
		int opcion;
		float ing,ret,saldoactual;
	
		opcion= Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
		+ "1.Ingresar dinero a la cuenta\n"
		+ "2.Retirar dinero de la cuenta\n"
		+ "3.Salir\n"));
		
		switch(opcion) {
			case 1: ing = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ingreso"));
					saldoactual=saldo +ing;
					JOptionPane.showMessageDialog(null,"Dinero en la cuenta: "+saldoactual);
					break;
			case 2: ret = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de retiro"));
			if (ret>saldo){
				JOptionPane.showMessageDialog(null,"No cuenta con esa cantidad");
			}else{
				saldoactual =saldo-ret;
				JOptionPane.showMessageDialog(null,"Dinero en la cuenta: "+saldoactual);
			}
			break;
			case 3 : break;
		
		
		}
		
		
		
		
		
		
		

	}

}
