package domein;

import java.util.List;

public class CursusRepository {
	
	private List<Cursus> cursussen;
	
	public CursusRepository(List<Cursus> cursussen) {
		this.cursussen = cursussen;
		
	}
	
	public Cursus geefGoedkoopsteCursus() {
		Cursus goedkoopste;
		for(Cursus cursus: cursussen) {
			//tijd op
		}
	}
	
	public int geefAantalTweedehandsCursussen() {
		int counter = 0;
		for(Cursus cursus: cursussen) {
			if(cursus instanceof TweedehandsCursus) {
				counter++;
			}
			//tijd op
		}
		return counter;
	}

}
