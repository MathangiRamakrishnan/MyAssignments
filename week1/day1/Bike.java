package week1.day1;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create 2 objects for 2 classes
		Car kia = new Car();
		Bike passion = new Bike();
		
		kia.AppliedBreak();
		kia.soundHorn();
		System.out.println("Bike class members " + passion.brakes + passion.tyres);
	}
	
	//Members of the "Bike" class
	String brakes = "strong breaks";
	int tyres = 2; 
}
