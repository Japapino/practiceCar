package practiceCar;

public class Engine implements CarPart{
	int condition;
	String engineType; 
	
	public Engine(String type) {
		this.engineType = type; 
	}
	
	public String getEngine() {
		return "v6"; 
	}

	@Override
	public String condition() {
		return "Runs smoothly"; 
	}

	@Override
	public int status() {
		return 10;
	}

}
