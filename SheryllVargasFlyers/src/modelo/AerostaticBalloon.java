package modelo;

public class AerostaticBalloon extends Vehicule implements Flyer{

	@Override
	public String takeoff() {
		
		return "Despejando - Aerostatico...";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizando - Aerostatico...";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "En el aire, el globo aerostatico...";
	}

}
