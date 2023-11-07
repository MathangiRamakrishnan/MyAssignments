package week3.day2;

public class ProfileTestData extends TestData{

	public static void enterAddress() {
		
		System.out.println("Pallikarnai");
		
	}
	
	public static void enterPhoneNumber() {
		
		System.out.println("8807834932");
		
	}
	
 public static void main(String[] args) {
	 ProfileTestData obj2 = new ProfileTestData();
	 obj2.enterCredentials();
	 obj2.navigateToHomePage();
	 obj2.enterUsername();
	 obj2.enterPassword();
	 obj2.enterAddress();
	 obj2.enterPhoneNumber();
}
	
}