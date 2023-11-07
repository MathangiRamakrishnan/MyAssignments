package week3.day2;

public class Safari extends Browser{
	
	public static void readerMode() {
		System.out.println("In Reader Mode");
	}
	
	public static void fullScreenMode() {
		System.out.println("In Full Screen Mode");
	}
	

	public static void main(String[] args) {
		Safari obj4 = new Safari();
		System.out.println(browserName);
		System.out.println(browserVersion);
		obj4.openURL();
		obj4.closeBrowser();
		obj4.navigateBack();
		obj4.readerMode();
		obj4.fullScreenMode();

	}

}
