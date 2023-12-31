package week3.day3;

public class MyPhone extends IPhone15{

	public void networkConnectivity() {
		
		System.out.println("5G");
	
	}
	
	public void camera() {
		System.out.println("48MP");
		
	}

	public static void main(String[] args) {
		MyPhone iph = new MyPhone();
		iph.securitySystem();
		iph.bluetoothVersion();
		iph.gps();
	
	}

	
		
		



}
