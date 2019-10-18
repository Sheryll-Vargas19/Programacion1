package modelo;

public class Mundo {
	
	private Empleado emp;
	private Persona per;
	private Gerente ger;
	private Mantenimiento mante;
	private Tecnología tecno;
	
	
	
	public Empleado getEmp() {
		return emp;
	}

	public void setEmp(Empleado emp) {
		this.emp = emp;
	}

	public Persona getPer() {
		return per;
	}

	public void setPer(Persona per) {
		this.per = per;
	}
	
	public Gerente getGer() {
		return ger;
	}

	public void setGer(Gerente ger) {
		this.ger = ger;
	}

	public Mantenimiento getMante() {
		return mante;
	}

	public void setMante(Mantenimiento mante) {
		this.mante = mante;
	}

	public Tecnología getTecno() {
		return tecno;
	}

	public void setTecno(Tecnología tecno) {
		this.tecno = tecno;
	}

	//Contructor
	public Mundo() {
		emp = new Empleado();
		per = new Persona();
		ger = new Gerente();
		mante = new Mantenimiento();
		tecno = new Tecnología();
		
		
	}

}
