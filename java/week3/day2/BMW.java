package week3.day2;

public class BMW extends Car {     //Car is superclass ; BMW is inheriting the properites of Car class using "extends" (inheritance)
	
	
	public static void main(String[] args) {
		BMW x5 = new BMW();
		x5.startCar();
		x5.stopCar();
		x5.applyBrake();
		x5.soundHorn();
		
	}

	
}


//If "extends" is removed, then it will throw compilation error