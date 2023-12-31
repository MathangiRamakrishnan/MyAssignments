package week3.day3;

public class SamsungOutlet extends Samsung {
	
	public static void sellingCost(){
		System.out.println("Selling cost is higher here when compared to the Samsung outlet");
	}

	public static void main(String[] args) {
		SamsungOutlet cost = new SamsungOutlet();
		cost.sellingCost();
		cost.quality();
		cost.sellingcost(20000); //Method Overloading
		
		Samsung mainCost = new Samsung();
		mainCost.sellingCost();
	}

}
