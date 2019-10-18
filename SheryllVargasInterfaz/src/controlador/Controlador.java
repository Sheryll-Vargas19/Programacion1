package controlador;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador {
	
	private Mundo bd;
	private InterfazGui gui;
	
	public Controlador() {
		
		bd = new Mundo();
		gui = new InterfazGui();
		
		gui.setVisible(true);
		
	}

}
