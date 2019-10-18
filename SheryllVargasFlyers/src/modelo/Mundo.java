package modelo;

public class Mundo {
	
	
	private Airplane air;
	private Bird bir;
	private Helicopter heli;
	private Hummingbird humm;
	private SeaPlane sea;
	private Superman sup;
	private Vehicule veh;
	private AerostaticBalloon aer;
	private Krypto pto;
	
	
	public Mundo() {
		
		air = new Airplane();
		bir = new Bird();
		heli = new Helicopter();
		humm = new Hummingbird();
		sea = new SeaPlane();
		sup = new Superman();
		veh = new Vehicule();
		aer = new AerostaticBalloon();
		pto = new Krypto();
		
		
			
			
		
	}
	
	
//Get and Set
	
	public Airplane getAir() {
		return air;
	}
	public void setAir(Airplane air) {
		this.air = air;
	}
	
	public Bird getBir() {
		return bir;
	}
	public void setBir(Bird bir) {
		this.bir = bir;
	}
	public Helicopter getHeli() {
		return heli;
	}
	public void setHeli(Helicopter heli) {
		this.heli = heli;
	}
	public Hummingbird getHumm() {
		return humm;
	}
	public void setHumm(Hummingbird humm) {
		this.humm = humm;
	}
	
	public SeaPlane getSea() {
		return sea;
	}
	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}
	public Superman getSup() {
		return sup;
	}
	public void setSup(Superman sup) {
		this.sup = sup;
	}
	public Vehicule getVeh() {
		return veh;
	}
	public void setVeh(Vehicule veh) {
		this.veh = veh;
	}
	public AerostaticBalloon getAer() {
		return aer;
	}

	public void setAer(AerostaticBalloon aer) {
		this.aer = aer;
	}

	public Krypto getPto() {
		return pto;
	}

	public void setPto(Krypto pto) {
		this.pto = pto;
	}
	
	
	

}
