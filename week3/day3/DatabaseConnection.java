package week3.day3;

interface DatabaseConnection {

	abstract void connect();
	abstract void disconnect();
	abstract void executeUpdate();
	
}
