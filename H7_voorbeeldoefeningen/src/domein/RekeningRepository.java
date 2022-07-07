package domein;

import java.util.ArrayList;
import java.util.List;

import persistentie.RekeningMapper;

public class RekeningRepository {
	private RekeningMapper rm;
	private List<Rekening> rekeningen;
	
	public RekeningRepository() {
		this.rm = new RekeningMapper();
		this.rekeningen = rm.geefRekeningen();
	}
	
	public List<Rekening> geefGewijzigdeRekeningen(){
		//List<Rekening> gewijzigdeRekeningen = new ArrayList<>(); 
		for(Rekening rk: rekeningen) {
			if(rk instanceof SpaarRekening) {
				double bedrag = (rk.getSaldo() * SpaarRekening.getAangroeiIntrest()) / 100.0;
				rk.stortOp(bedrag);
				//gewijzigdeRekeningen.add(rk);
			}
			if(rk instanceof ZichtRekening) {
				ZichtRekening zrk = (ZichtRekening) rk;
				zrk.setMaxKredietOnderNul(zrk.getMaxKredietOnderNul() - 10.0);
				//gewijzigdeRekeningen.add(zrk);
			}
		}
		return rekeningen;
	}

}
