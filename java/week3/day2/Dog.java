package week3.day2;

public class Dog extends Animal {

	static boolean canBark = true;
	static int legs = 5 ; //Method overriding --> in Animal class legs = 4, but here 5 --> output will be 5 because subclass will override the superclass
	
	public static void eat(){
		System.out.println("Dog is Eating");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Dog obj = new Dog();
		
		System.out.println(obj.legs);
		System.out.println(obj.canBark);
		obj.eat();
		obj.walk();
		
	}
}