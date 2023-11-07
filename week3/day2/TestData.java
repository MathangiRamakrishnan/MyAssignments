package week3.day2;

public class TestData extends LoginTestData{

	public static void enterUsername() {
		
		System.out.println("Aravind Muthiah");
		
	}
	
	public static void enterPassword() {
		
		System.out.println("Sairam123");
		
	}
	
 public static void main(String[] args) {
	 TestData obj1 = new TestData();
	 obj1.enterCredentials();
	 obj1.navigateToHomePage();
	 obj1.enterUsername();
	 obj1.enterPassword();
}
	
}