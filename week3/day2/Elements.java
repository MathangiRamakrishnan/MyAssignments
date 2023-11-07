package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		
		Elements obj1 = new Elements();
		obj1.click();
		obj1.setText("Hi");
		obj1.submit();
		
		TextField obj2 = new TextField();
		obj2.getText();
		
		CheckBoxButton obj3 = new CheckBoxButton();
		obj3.clickCheckButton();
		
		RadioButton obj4 = new RadioButton();
		obj4.selectRadioButton();
		
	}

}
