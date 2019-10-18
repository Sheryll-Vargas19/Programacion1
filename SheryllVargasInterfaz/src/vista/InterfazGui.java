package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class InterfazGui extends JFrame{
	
	public InterfazGui() {
		
		setSize(400,400);
		setResizable(false);
		setTitle("Ventana Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
	}

}
