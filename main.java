import java.util.*;
import javax.swing.*;

class Program{
	public static void main(String args[]){
		Set<String> A = new HashSet<String>();
		Set<String> B = new HashSet<String>();
		Set<String> temp1 = new HashSet<String>();
		Set<String> temp2 = new HashSet<String>();

		int selection;
		int entries;
		while(true){
			temp1.clear();
			temp2.clear();
			if(A.size()>0 && B.size()>0){
				selection = Integer.parseInt(JOptionPane.showInputDialog("1.- Añadir elementos al conjunto A\n2.- Añadir elementos al conjunto B\n3.- Mostrar la unión\n4.- Mostrar el conjunto intersección \n5.- Mostrar el conjunto diferencia del primer conjunto\n6.- Mostrar el conjunto diferencia del segundo conjunto\n7.- Salir"));
				if(selection==7){
					selection = -1;
				}
				else if(selection<1 || selection>6){
					selection = 0;
				}
			}
			else{
				selection = Integer.parseInt(JOptionPane.showInputDialog("1.- Añadir elementos al conjunto A\n2.- Añadir elementos al conjunto B\n3.-Salir"));
				if(selection==3){
					selection = -1;
				}
				else if(selection<1 || selection>2){
					selection = 0;
				}
			}
			if(selection==0){
				JOptionPane.showMessageDialog(null, "Elija una opcion correcta");
			}
			else if(selection==1){
				entries = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos quiere ingresar?"));
				for(int i = 0; i<entries; i++){
					A.add(JOptionPane.showInputDialog("Ingresa lo que quieres almacenar"));
				}
			}
			else if(selection==2){
				entries = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos quiere ingresar?"));
				for(int i = 0; i<entries; i++){
					B.add(JOptionPane.showInputDialog("Ingresa lo que quieres almacenar"));
				}
			}
			else if(selection==3){
				temp1.addAll(A);
				temp2.addAll(B);
				temp1.addAll(temp2);
				JOptionPane.showMessageDialog(null, temp1);
			}
			else if(selection==4){
				temp1.addAll(A);
				temp2.addAll(B);
				temp1.retainAll(temp2);
				JOptionPane.showMessageDialog(null, temp1);
			}
			else if(selection==5){
				temp1.addAll(A);
				temp2.addAll(B);
				temp1.removeAll(temp2);
				JOptionPane.showMessageDialog(null, temp1);
			}
			else if(selection==6){
				temp1.addAll(A);
				temp2.addAll(B);
				temp2.removeAll(temp1);
				JOptionPane.showMessageDialog(null, temp2);
			}
			else if(selection==-1){
				break;
			}
		}
	}
}
