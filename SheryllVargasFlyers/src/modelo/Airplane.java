package modelo;

public class Airplane implements Flyer{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "El avión esta despegando...";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El avión esta aterrizando...";
		
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El avión esta en el aire...";
	}

}
