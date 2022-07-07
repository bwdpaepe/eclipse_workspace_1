package domein;

import java.util.ArrayList;
import java.util.List;

public class DierenWinkel {
	private List<Huisdier> lijstHuisdieren; 
	
	public DierenWinkel() {
	lijstHuisdieren = new ArrayList<>();
	/*lijstHuisdieren.add(new Duif("Blauwe geschelpte", 20180000001L));
	lijstHuisdieren.add(new Kat("Minoe"));
	lijstHuisdieren.add(new Hond("Rex"));
	lijstHuisdieren.add(new Hond("Lassie"));
	lijstHuisdieren.add(new Duif("Witoog", 20199876543L));
	lijstHuisdieren.add(new Kat("Garfield"));*/
	}
	
	public String[] stelDierenVoor() {
		String[] voorstelling = new String[this.lijstHuisdieren.size()];
		int counter = 0;
		for(Huisdier dier: this.lijstHuisdieren) {
			voorstelling[counter] = String.format("%s zegt %s", dier, dier.maakGeluid());
			counter++;
		}
		return voorstelling;
	}
	
	public String geefSpuitje(Huisdier dier) {
		return String.format("auw.. %s", dier.maakGeluid());
	}
	
	public void voegHuisdierToe(Huisdier dier) {
		this.lijstHuisdieren.add(dier);
	}
	
	public Huisdier geefDierOpIndex(int index) {
		return this.lijstHuisdieren.get(index);
	}
	
	public int geefAantalDieren() {
		return this.lijstHuisdieren.size();
		
	}
}
