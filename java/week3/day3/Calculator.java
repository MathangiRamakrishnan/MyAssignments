package week3.day3;

public class Calculator {

	// Static PolyMorphism / method overloading 
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public void add(int a, float b) {
		System.out.println(a+b);
		
		
	}

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		cal.add(2, 3);
		cal.add(2, 2.5f);
		cal.add(2, 3, 4);
	
	}

}

