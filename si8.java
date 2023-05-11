package Condicionales;

import javax.swing.JOptionPane;

public class si8 {

	public static void main(String[] args) {
		int dia,mes,año;
		dia=Integer.parseInt(JOptionPane.showInputDialog("Digite un dia"));
		mes=Integer.parseInt(JOptionPane.showInputDialog("Digite un mes"));
		año=Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));
	
	if((dia>=1)&&(dia<=30)){
		if((mes>=1)&&(mes<=12)){
			
			if(año!=0){
				JOptionPane.showMessageDialog(null,"fecha correcta");
			}else{
				JOptionPane.showMessageDialog(null,"fecha incorrecta,año incorrecta");
			}
		
		}else{
			JOptionPane.showMessageDialog(null,"fecha incorrecta,mes incorrecta");
		}
			
	}else{
		JOptionPane.showMessageDialog(null,"fecha incorrecta,dia incorrecta");
	}
	
	
	
	
	}

}
