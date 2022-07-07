package cui;

import domein.Craps;

public class CrapsApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Craps myCraps = new Craps();
		
		myCraps.speelEersteRonde();
		
		while(myCraps.nogBezig()) {
			myCraps.speelVerder();
		}
		
		

	}

}
