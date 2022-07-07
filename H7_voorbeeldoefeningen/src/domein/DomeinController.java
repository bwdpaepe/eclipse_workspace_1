package domein;

import java.util.List;

public class DomeinController {
	private final RekeningRepository rr;
	public DomeinController() {
		this.rr = new RekeningRepository();
//		this.geefRekeningen();
		
	}
	public String geefRekeningen() {
		String output = "";
		List<Rekening> rk = rr.geefGewijzigdeRekeningen();
		for(Rekening rekening: rk) {
			output += rekening.toString();
		}
		return output;
	}

}
