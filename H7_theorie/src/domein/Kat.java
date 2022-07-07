package domein;

import java.security.SecureRandom;

public class Kat extends Huisdier {

	public Kat(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String maakGeluid() {
		return "miauw miauw miauw" + super.maakGeluid();
	}
	
	@Override
	public boolean luisterNaarNaam(String naam) {
		SecureRandom sr = new SecureRandom();
		int eenOpVijf = sr.nextInt(5) + 1;
		if(eenOpVijf == 1) {
			return super.luisterNaarNaam(naam);
		}
		
		return false;
	}
	
	public String spin() {
		return super.getNaam() + " spint";
	}

}
