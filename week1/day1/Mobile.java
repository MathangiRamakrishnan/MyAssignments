package week1.day1;

public class Mobile {


	public void makeCall() {
		String mobileModel = "Iphone";
		float mobileWeight = 100.15f ;
		System.out.println("My mobile is :" +mobileModel+ " & the weight is:" +mobileWeight);
	}

	public void sendMsg() {
		boolean isFullCharged = true;
	    int mobileCost = 70000;
		System.out.println("Charging complete? " +isFullCharged+ " The cost is:" +mobileCost);
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object for class
		Mobile object = new Mobile();
		object.makeCall();
		object.sendMsg();
		System.out.println("This is my mobile");
		
	}
}
