package week3.day3;

public class LoginPage extends BasePage{
	
	@Override
	
	public void clickElement() {
				
		System.out.println("Don't click the element");
		
	}

	public static void main(String[] args) {
		
		LoginPage page = new LoginPage();
		page.findElement();
		page.clickElement();
		page.enterText();
		page.performCommonTasks();
		
	}

}
