package domein;

public class Wind {
	
	private char richting;
	private double kracht;
	
	public Wind(char richting, double kracht) {
		this.setKracht(kracht);
		this.setRichting(richting);
	}

	public char getRichting() {
		return richting;
	}

	private void setRichting(char richting) {
		if(richting != 'N' ||richting != 'N'||richting != 'N'||richting != 'N') {
			throw new IllegalArgumentException("mis");
		}
		this.richting = richting;
	}

	public double getKracht() {
		return kracht;
	}

	private void setKracht(double kracht) {
		if(kracht<0||kracht>300) {
			throw new IllegalArgumentException("mis");
		}
		this.kracht = kracht;
	}
	
	public boolean isGuur() {
		
		if(this.getKracht()>50) {
			return true;
		}
		return false;
		
	}
	
	public void neemInKrachtToe(int percentage) {
		//ondergrens 0
		//bovengrens 100
		
		//tijd op
	}
	
	
	

}
