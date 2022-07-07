package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Rekening;
import domein.SpaarRekening;
import domein.ZichtRekening;

public class RekeningMapper {
	
	public List<Rekening> geefRekeningen(){
		Rekening rekening1 = new ZichtRekening(123456700082L, "Jan", -2000);
		rekening1.stortOp(1200);
		Rekening rekening2 = new SpaarRekening(123456780009L, "Sandra");
		rekening2.stortOp(5000);
		SpaarRekening.setAangroeiIntrest(5);
		List<Rekening> lr = new ArrayList<>();
		lr.add(rekening1);
		lr.add(rekening2);
		return lr;
	}

}
