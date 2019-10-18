package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	public Mundo m;
	public Interfaz gui;
	
	
	public Controlador() {
		m = new Mundo();
		gui = new Interfaz();
		
		
		gui.mostrarVoladores(m.getVeh().mostarVehiculo());
		gui.mostrarVoladores(m.getAir().land());
		gui.mostrarVoladores(m.getAer().takeoff());
		gui.mostrarVoladores(m.getHeli().takeoff());
		gui.mostrarVoladores(m.getBir().fly());
		gui.mostrarVoladores(m.getHumm().eat());
		gui.mostrarVoladores(m.getPto().leapBuilding());
		gui.mostrarVoladores(m.getSea().takeoff());
		gui.mostrarVoladores(m.getSup().stopBullet());
		
		
		
	}
	

	
}
