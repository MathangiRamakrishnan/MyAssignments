package week7.day3;

public class LearnThreadLocal {
	
	// access modifier static final ThreadLocal <Wrapper class> variableName = new ThreadLocal <Wrapper class> 
	private static final ThreadLocal<String> atmPin = new ThreadLocal<String>();
	private static final String pin = "1234";

	public void setPin() {
		// By using Set method, we will set data for the Thread
		atmPin.set("9876");
	}
	
	public String getPin() {
		// By using Get method, we will get data from the Thread
		return atmPin.get();
	}
	
	public static void main(String[] args) {
		LearnThreadLocal ltl = new LearnThreadLocal();
		ltl.setPin();
		System.out.println(ltl.getPin());
	}

}










/* Thread Local :
 * A variable that is local to each thread.
 * Each thread means --> Its own data for each execution will be different
 */


