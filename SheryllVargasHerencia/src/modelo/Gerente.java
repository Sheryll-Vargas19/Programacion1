package modelo;

public class Gerente extends Empleado {
	
	private String supervisar;
	private String comunicar;
//Constructor	
	public Gerente() {
		
	}

	public String getSupervisar() {
		return supervisar;
	}

	public void setSupervisar(String supervisar) {
		this.supervisar = supervisar;
	}
	

	public String getComunicar() {
		return comunicar;
	}

	public void setComunicar(String comunicar) {
		this.comunicar = comunicar;
	}

//Metodos
	public String seleccionarPersonal() {
		return "¡BIENVENIDO!";
	}
	public String despedirEmpleado() {
		return "¡DESPEDIDO!";
	}
}
