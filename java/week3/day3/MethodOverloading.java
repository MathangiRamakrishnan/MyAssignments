package week3.day3;

public class MethodOverloading {

	public static void reportStep (String msg, String status) {
		System.out.println(msg + status);
	}
	
	public static void reportStep (String msg, String status, boolean snap) {
		System.out.println(msg + status + " " + snap);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.reportStep("hi", " hello");
		obj.reportStep("hi", " hello", true);
		obj.reportStep("hi", " hello", false);
		
	}

}
