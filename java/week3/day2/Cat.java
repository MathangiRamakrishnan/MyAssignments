package week3.day2;

public class Cat extends Animal {

	static boolean canDrinkMilk = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat obj2 = new Cat();
		
		System.out.println(obj2.legs);
//		System.out.println(obj2.canBark);i
		System.out.println(obj2.canDrinkMilk);
		
		obj2.eat();
		obj2.walk();
		
	}
}