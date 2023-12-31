package week6.day3;

public class LearnConstructor {

	// Constructor syntax --> accessModifier sameClassName inputArgs{}
	
	public LearnConstructor() {	
		System.out.println("This is default constructor");
	}
	
	// public void LearnConstructor(){   ---> This is the method
	// } 
	
	//Constructor should definitely have the class name, whereas method name can be different
	
	public LearnConstructor(int x) {   //-----> Parameterized constructor 
		System.out.println("This is paramaterized constructor :" +x);
				
	}
	
	public void LearnConstructor() {
		System.out.println("This is a normal method");
	}
	
	public static void main(String[] args) {
	LearnConstructor lc = new LearnConstructor();
	LearnConstructor lc1 = new LearnConstructor(5);

	}

}
