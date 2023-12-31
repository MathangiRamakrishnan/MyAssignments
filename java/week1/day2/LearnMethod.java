package week1.day2;

public class LearnMethod {     //If this is changed to private, none of the objects will be created in any class
                               //If this is changed to protected, LearnAccessModifier can be accessed with help of objects.     
	
	// main method -- entry point
	public static void main(String[] args) {
		//create object for the class
		//Syntax is 
		// ClassName object = new ClassName();
		
		LearnMethod polo = new LearnMethod();
		polo.applyBreak();
		polo.soundHorn();
			
		
		LearnMethod horn = new LearnMethod();
		horn.soundHorn();
       
	}
        // Access modifier  returnType methodName (inputArgument){
	//}   Writing code for car example . applyBreak is a normal method. Normal method comes inside the main method only.
	     //Main method is still very important.
	
	    public void applyBreak() {
	    	System.out.println("Break is applied");
	    }
	    
	    private void soundHorn() {
	    	System.out.println("Sound Horned");
	    }
}

//outside the main method, nothing gets printed in console. Hence we will create object for the class.