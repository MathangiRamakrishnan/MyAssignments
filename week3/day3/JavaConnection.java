package week3.day3;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public void connect() {
		
		System.out.println("Connecting");
	
	}
	
	public void disconnect() {
		
		System.out.println("Disconnecting");
		
	}
	
	public void executeUpdate() {
		
		System.out.println("Executing the update");
		
	}
	
	public void executeQuery() {
		System.out.println("Executing the Query");
	}
	
	
	public static void main(String[] args) {
		
		JavaConnection ob = new JavaConnection();
		ob.connect();
		ob.disconnect();
		ob.executeUpdate();
		ob.executeQuery();
		
	
		

	}

	
}
