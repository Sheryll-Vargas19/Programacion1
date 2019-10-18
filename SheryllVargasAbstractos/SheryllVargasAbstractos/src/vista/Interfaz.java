package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void mostarAlimentacion(String cadena) {
		
		JOptionPane.showMessageDialog(null, cadena, "Mamifero",
				                      JOptionPane.INFORMATION_MESSAGE);
	}
}
