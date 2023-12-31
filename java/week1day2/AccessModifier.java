package week1day2;

import week1.day2.LearnMethod;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LearnMethod countryMan = new LearnMethod();
        countryMan.applyBreak();
     // countryMan.soundHorn(); Cannot be accessed here despite making it as protected because protected cannot access in different package.
     // This can work only with inheritance (OOPS concept)   
        
	}

}




//To understand this code, we are making "soundHorn" method as protected and LearnMethod class as public.