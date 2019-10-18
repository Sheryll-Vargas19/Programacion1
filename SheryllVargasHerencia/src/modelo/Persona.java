package modelo;

public class Persona {

	protected int edad;
	protected String nombre;
//Constructor	
	public Persona() {
		edad = 0;
		nombre ="";
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//Metodos
	
	public String dormir() {	
		return "Dormir";
	}
	
	public String comer() {
		return "Comer";
	}
	

}
