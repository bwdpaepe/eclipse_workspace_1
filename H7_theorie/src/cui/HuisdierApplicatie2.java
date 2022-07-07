package cui;

import domein.DomeinController;

public class HuisdierApplicatie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomeinController dc = new DomeinController();
		dc.initialiseerDierenWinkel();
		String[] overzicht = dc.stelDierenVoor();
		for(String eenDier: overzicht) {
			System.out.println(eenDier);
		}
		System.out.println();
		
		System.out.println(dc.geefSpuitjes());
	}

}
