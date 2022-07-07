package domein;

public class DomeinController {
	
	private DierenWinkel winkel;
	
	public DomeinController() {
		this.winkel = new DierenWinkel();
		
		
	}
	
	public void initialiseerDierenWinkel() {
		this.winkel.voegHuisdierToe(new Duif("Blauwe geschelpte", 20180000001L));
		this.winkel.voegHuisdierToe(new Kat("Minoe"));
		this.winkel.voegHuisdierToe(new Hond("Rex"));
		this.winkel.voegHuisdierToe(new Hond("Lassie"));
		this.winkel.voegHuisdierToe(new Duif("Witoog", 20199876543L));
		this.winkel.voegHuisdierToe(new Kat("Garfield"));
		
	}
	
	public String[] stelDierenVoor() {
		return this.winkel.stelDierenVoor();
	}
	
	public String geefSpuitjes() {
		String uitvoer = "";
		int index;
		for(int i = 0; i < this.winkel.geefAantalDieren(); i++) {
			Huisdier dier = this.winkel.geefDierOpIndex(i);
			uitvoer += this.winkel.geefSpuitje(dier);
		}
		return uitvoer;
	}

}
