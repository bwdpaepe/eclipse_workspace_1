package cui;

import domein.DomeinController;

public class RekeningApplicatie {
	private DomeinController dc;
	
	public RekeningApplicatie(DomeinController dc) {
		this.dc = dc;
		//this.werkMetRekeningen();
		
	}
	
	public void werkMetRekeningen() {
		System.out.printf("%s", this.dc.geefRekeningen());
	}

}
