package modelo;

public class Mantenimiento extends Empleado {

	private String limpieza;
	protected String actitud;
//Constructor	
	public Mantenimiento() {
		limpieza ="";
		actitud ="";
		
	}

	public String getLimpieza() {
		return limpieza;
	}

	public void setLimpieza(String limpieza) {
		this.limpieza = limpieza;
	}


	public String getActitud() {
		return actitud;
	}

	public void setActitud(String actitud) {
		this.actitud = actitud;
	}
//Metodos
	
	public String limpiezaBa�os() {
		return "Limpieza de ba�os...";
		
	}
	
	public String limpiezaOficinas() {
		return "Limpieza de Oficinas...";
	}
}
