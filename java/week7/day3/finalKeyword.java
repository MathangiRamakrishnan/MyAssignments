package week7.day3;

public class finalKeyword {
	// x is a global variable
	int x = 10;
	
	final int a = 10;
	
	public void m1() {
		x = 20;
	//	a = 20; --> this throws compilation error because values cannot be changed if "final" keyword is used

	}
	
	public final void m2() {    //Overriding is not possible
		
		
	}
	
	public final void m2(int x) {  // Overloading is possible
		
		
	}
	
	public static void main(String[] args) {
		finalKeyword lf = new finalKeyword();
		System.out.println(lf.x);
		lf.m1();
		System.out.println(lf.x);
		System.out.println("===================");
		System.out.println(lf.a);
	}
}





/* 	Final keyword : In Java, final is a keyword
  	If I declare any variable or method as final, the values cannot be changed
  	In variable level, we can able to read or access the value but we cannot change it
  	In method level, we can read or access the method, but override is not possible 
  	Overloading is still possible in method level */
