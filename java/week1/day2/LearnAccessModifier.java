package week1.day2;

public class LearnAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LearnMethod mini = new LearnMethod(); 
         LearnMethod vento = new LearnMethod();
         mini.applyBreak();
        // vento.soundHorn(); // It will show error because soundHorn() is in private, so it cannot handle from different class
	}

}
