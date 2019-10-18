package modelo;

public class Mundo {
	
	private Mamifero mami;
	private Canino can;
	private Felino feli;
	private Roedor roe;
	
	
	public Mamifero getMami() {
		return mami;
	}
	public void setMami(Mamifero mami) {
		this.mami = mami;
	}
	public Canino getCan() {
		return can;
	}
	public void setCan(Canino can) {
		this.can = can;
	}
	public Felino getFeli() {
		return feli;
	}
	public void setFeli(Felino feli) {
		this.feli = feli;
	}
	public Roedor getRoe() {
		return roe;
	}
	public void setRoe(Roedor roe) {
		this.roe = roe;
	}
	
	
	public Mundo() {
		
		//mami = new Mamifero();
		can = new Canino();
		feli = new Felino();
		roe = new Roedor();
		
	}
	

}
