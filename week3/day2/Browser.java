package week3.day2;

public class Browser {

	static String browserName = "Google Chrome";
	static float browserVersion = 7.2f;
	
	public void openURL() {
		System.out.println("www.google.com");
	}
	
	public void closeBrowser() {
		System.out.println("Closed");
	}

	public void navigateBack() {
		System.out.println("Going Back");
	}
	
	
	
	public static void main(String[] args) {
		
		Browser obj1 = new Browser();
		System.out.println(browserName);
		System.out.println(browserVersion);
		obj1.openURL();
		obj1.closeBrowser();
		obj1.navigateBack();
		

	}

}
