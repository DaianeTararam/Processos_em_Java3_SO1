//@author Daiane Tararam
package view;

import javax.swing.JOptionPane;

import controller.DistroController;

public class Main {

	public static void main(String[] args) {
		DistroController controller = new DistroController();
		
		int opcao =0;
		while(opcao!= 2) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja exibir as propriedades de distribuição?\n1 - SIM\n2 - NÃO"));
			switch(opcao) {
				case 1:
					controller.exibeDistro();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Aplicação finalizada com sucesso!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Tente Novamente!");
			}
		}
	}

}
