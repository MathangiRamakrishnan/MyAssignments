package week3.day3;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
		
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println(endpoint + requestBody + " " + requestStatus);
		
	}
	
	public static void main(String[] args) {
		
		APIClient req = new APIClient();
		req.sendRequest("2");
		req.sendRequest("2", " yes",  true);
		
		
	}




}
