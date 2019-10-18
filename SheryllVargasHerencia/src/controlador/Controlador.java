package controlador;


import modelo.Mundo;
import vista.Interfaz;


public class Controlador {
	
	private Mundo m;
	private Interfaz gui;
	
	
	
	public Controlador() {
				
		m = new Mundo();
		gui = new Interfaz();
				
		
		
	//Herencia
		gui.mostarDato(m.getEmp().dormir());
		gui.mostarDato(m.getEmp().comer());
		gui.mostarDato(m.getGer().seleccionarPersonal());
		gui.mostarDato(m.getGer().despedirEmpleado());
		gui.mostarDato(m.getMante().limpiezaBaños());
		gui.mostarDato(m.getMante().limpiezaOficinas());
		gui.mostarDato(m.getTecno().instalarAplicacion());
		gui.mostarDato(m.getTecno().soporteEquipos());
		
	}
	


}
