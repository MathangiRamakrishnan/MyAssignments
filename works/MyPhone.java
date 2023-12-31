package personal.works;

public class MyPhone extends iOS{

	public static void main(String[] args) {
		
		iPhone obj = new iPhone();
		
		obj.startApp();
		obj.increaseVolume();
		obj.shutDown();
		obj.makeCall();
		obj.sendSMS();
				
	//	obj.watchMovie(); Cannot be accessed because we did not create object for iPad
		
		iPad obj1 = new iPad();
		
		obj1.watchMovie();
	}

}
