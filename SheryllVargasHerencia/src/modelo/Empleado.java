package modelo;

public class Empleado extends Persona  {

	private int salario;
	private String cargo;
	
	public Empleado() {
		salario = 0;
		cargo = "";
		
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String trabajar() {
		return "Yo trabajo que mamera!!";
		
//Super hace algo parecidoa this (Refenciar atributo de la misma clase)		
		//super.dormir();
	}
}
