package week2.day1;

public class Selection {

	public void checkEligibility(int age) {
		
		if(age>=18) {
			System.out.println("You are eligible to vote/buy a driving license");
		} else {
			System.out.println("You are not eligible");
		}
		
	}
	
	
	public void phone(int mark) {
		//if above 70% - get Iphone
		//Above 90% - get macbook
		//below 70% - nothing
		
		// && and operator, || or operator
		
		if((mark>=70) && (mark<90)) {        // 95>70
			System.out.println("Get MacBook");
		}else if((mark>=90) || (mark>100)) {
			System.out.println("Get IPhone");
		}else if((mark<70) && (mark>45)) {
			System.out.println("Nothing");
		}else {
			System.out.println("Not satisfied");
		}
	}
	
	
	public static void main(String[] args) {
		
		Selection select = new Selection();
		select.checkEligibility(1);
		select.phone(90);
		
		
		

	}

}
