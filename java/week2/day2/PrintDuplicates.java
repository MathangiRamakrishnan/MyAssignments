package week2.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] num = new int[] {2,5,7,7,5,9,2,3};
		
		System.out.println("The duplicate values are ");
		
		for (int i=0 ; i<num.length; i++) {
			for(int j=i+1 ; j<num.length; j++) {
				if(num[i]==num[j])
					System.out.println(num[j]);
			}
		}

	}

}
