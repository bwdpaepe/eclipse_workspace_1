package domein;

import domein.Accessoire;

import java.math.BigDecimal;
import java.util.List;

public class ElektrischeFiets extends Fiets {
	
	private int actieRadius;
	private boolean walkAssist;

	public ElektrischeFiets(int aantalVersnellingen, String Kleur, BigDecimal prijs, int actieRadius, boolean WalkAssist) {
		super(aantalVersnellingen, Kleur, prijs);
		// TODO Auto-generated constructor stub
		this.setActieRadius(actieRadius);
		this.setWalkAssist(WalkAssist);
		
		
	}
	
	private void setActieRadius(int actieRadius) {
		this.actieRadius = actieRadius;
	}

	private void setWalkAssist(boolean walkAssist) {
		this.walkAssist = walkAssist;
	}
	
	public List<Accessoire> geefAccessoiresOnderPrijs(BigDecimal prijs){
		
	}
	
	public void voegAccessoireToe(Accessoire accessoire) {
		
	}

	
	
	

}
