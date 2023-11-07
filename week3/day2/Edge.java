package week3.day2;

public class Edge extends Browser{
	
	public static void takeSnap() {
		System.out.println("Snap is taken");
	}
	
	public static void clearCookies() {
		System.out.println("Cookies are cleared");
	}

	public static void main(String[] args) {
		Edge obj3 = new Edge();
		System.out.println(browserName);
		System.out.println(browserVersion);
		obj3.openURL();
		obj3.closeBrowser();
		obj3.navigateBack();
		obj3.takeSnap();
		obj3.clearCookies();

	}

}
