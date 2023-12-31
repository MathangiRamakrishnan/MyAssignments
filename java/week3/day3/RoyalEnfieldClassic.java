package week3.day3;

public class RoyalEnfieldClassic extends BikeOverriding {

	public void start() {
		System.out.println("Kick starting the vehicle now");
	}	
	
	public static void main(String[] args) {
		RoyalEnfieldClassic re = new RoyalEnfieldClassic();
		re.wheels();
		re.speedometer();
		re.start();

	}

}
