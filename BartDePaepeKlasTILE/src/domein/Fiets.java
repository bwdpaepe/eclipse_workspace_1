package domein;

import java.math.BigDecimal;

public class Fiets {
	private final String[] TYPES = {"Herenfiets", "Damesfiets", "Kinderfiets"};
	private String Kleur;
	private int aantalVersnellingen;
	private BigDecimal prijs;
	
	public Fiets(int aantalVersnellingen, String kleur, BigDecimal prijs) {
		this.aantalVersnellingen = aantalVersnellingen;
		this.setKleur(kleur);
		this.prijs = prijs;
	}
	
	
	
	public String getKleur() {
		return Kleur;
	}



	public void setKleur(String kleur) {
		Kleur = kleur;
	}



	@Override
	public String toString() {
		
	}
	

}
