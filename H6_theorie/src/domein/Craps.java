package domein;

import java.security.SecureRandom;

public class Craps {
	
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEN = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;
	
	private enum Status {VERDER, GEWONNEN, VERLOREN};
	
	private int bijgehoudenSom;
	private int steen1;
	private int steen2;
	private Status spelStatus;
	
	public void speelEersteRonde() {
		this.rolDobbelstenen();
		int som = this.bepaalSom();
		switch(som) {
		case SEVEN:
		case YO_LEVEN:
			spelStatus = Status.GEWONNEN;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			spelStatus = Status.VERLOREN;
			break;
		default:
			spelStatus = Status.VERDER;
			this.bijgehoudenSom = som;
			break;
		}
	}
	
	public boolean nogBezig() {
		return this.spelStatus == Status.VERDER;
		
	}
	
	public void speelVerder() {
		this.rolDobbelstenen();
		int som = this.bepaalSom();
		if(som == this.bijgehoudenSom) {
			spelStatus = Status.GEWONNEN;
		}
		else if(som == SEVEN) {
			spelStatus = Status.VERLOREN;
		}
	}
	
	private void rolDobbelstenen() {
		this.steen1 = this.rolDobbelsteen();
		this.steen2 = this.rolDobbelsteen();
		
		
	}
	
	private int rolDobbelsteen() {
		SecureRandom randomNum = new SecureRandom();
		return (randomNum.nextInt(6) + 1); 
	}
	
	public int bepaalSom() {
		return this.steen1 + this.steen2;
	}

}
