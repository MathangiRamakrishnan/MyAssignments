package week7.day3;

public class LearnEncapsulation {

	private String setPin() {
		System.out.println("Set ATM Pin set successfully");
		return "1234";
	}
	
	public String getPin() {
		return getPin();
		
	}
	public static void main(String[] args) {
		
		LearnEncapsulation le = new LearnEncapsulation();
		le.setPin();
		le.getPin();
		
	}

}
