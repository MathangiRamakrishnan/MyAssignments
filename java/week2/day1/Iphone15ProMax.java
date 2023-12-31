package week2.day1;

public class Iphone15ProMax {

		//Method signature - accessModifier returnType MethodName (inputArguments)
        // void - no return
	
	public void takeSnap() {
        // command for the functions
		System.out.println("Cheese take a snap");
	}
	
	
	public void makeCall(String person) {
		//In order to mention whom should be called, we pass an input argument with string data type to mention the person
	    // String person is an input argument
		System.out.println("Hey Siri call " + person);	
	}
	
	
	public void openApp() {
		System.out.println("Hey Siri open whatsapp");

	}
	
	
	public void sendMsg(String app, String person, String msg) {
		System.out.println("Hey siri open " + app + " and send a message to "+person+ " and the message is "+ msg);
	}
	
	//Different return types
		public int addNum(int num1, int num2) {
			int sum = num1 + num2;
		    return sum;     // As the answer is int data type, instead of void, we should mention int. If void is given, it throws error because void doesn't return any value
		}
		
		public float multiply(int num1, float num2) {
			float output = num1*num2;
			return output;
		}
		
	
	public static void main(String[] args) {
		
		//creating object for the class
		//By the help of Object only we can access the methods
	    //Same function can be used multiple times
		
		Iphone15ProMax myPhone = new Iphone15ProMax();
        
		myPhone.takeSnap();
		myPhone.makeCall("Amma");
		myPhone.openApp();
		myPhone.sendMsg("whatsapp", "Arun", "Call me at 1:00pm");
		myPhone.makeCall("Aravind");
	
		
		System.out.println("========================================================");
		
		int addNum = myPhone.addNum(1, 2); //ctrl+2,l
		System.out.println(addNum);
		System.out.println(myPhone.multiply(2, 4.5f));
	}

	
}
