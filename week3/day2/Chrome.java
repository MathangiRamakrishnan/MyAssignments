package week3.day2;

public class Chrome extends Browser{
	
	public static void openIncognito() {
		System.out.println("Incognito mode is opened");
	}
	
	public static void clearCache() {
		System.out.println("Cache is cleared");
	}
	

	
	public static void main(String[] args) {
		Chrome obj2 = new Chrome();
		System.out.println(browserName);
		System.out.println(browserVersion);
		obj2.openURL();
		obj2.closeBrowser();
		obj2.navigateBack();
		obj2.openIncognito();
		obj2.clearCache();
	}

}
