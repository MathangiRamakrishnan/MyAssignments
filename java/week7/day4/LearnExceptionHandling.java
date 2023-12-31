package week7.day4;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c;
		
		c = a+b ;
		System.out.println(c);
		
		try {
			c=a/0;
			System.out.println(c);
		} catch (Exception e) {
			System.err.println(e);
		
			c = a/1;
			System.out.println(c);
		}

			int[] x = {1,2,3,4,5,6};
			
			try {
			System.out.println(x[6]);
			} catch(IndexOutOfBoundsException e) {
				System.err.println(e);
				System.out.println(x[5]);
			}
	}

}
