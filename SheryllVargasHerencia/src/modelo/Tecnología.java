package modelo;

public class Tecnolog�a extends Empleado{
	
	private String configurar;
	private String reparar;
	
	public Tecnolog�a() {
		configurar="";
		reparar="";
		
		
	}


	public String getConfigurar() {
		return configurar;
	}


	public void setConfigurar(String configurar) {
		this.configurar = configurar;
	}
		
	public String getReparar() {
		return reparar;
	}

	public void setReparar(String reparar) {
		this.reparar = reparar;
	}

//Metodos
	
	public String instalarAplicacion() {
		return "Aplicaciones";
	}
	
	public String soporteEquipos() {
		return "Soporte";
	}

}
