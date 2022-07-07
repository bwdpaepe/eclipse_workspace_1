package domein;

public class Rechthoek {
	
	private double lengte;
	private double breedte;
	
	public Rechthoek(double lengte, double breedte) {
		this.setLengte(lengte);
		this.setBreedte(breedte);
	}

	public double getLengte() {
		return lengte;
	}

	private void setLengte(double lengte) {
		if(lengte <= 0) {
			throw new IllegalArgumentException("lengte > 0");
		}
		this.lengte = lengte;
	}

	public double getBreedte() {
		return breedte;
	}

	private void setBreedte(double breedte) {
		if(breedte <= 0) {
			throw new IllegalArgumentException("breedte > 0");
		}
		this.breedte = breedte;
	}
	
	public double geefOmtrek() {
		return (this.getLengte() + this.getBreedte()) * 2.0;
	}
	
	public double geefOppervlakte() {
		return (this.getLengte() * this.getBreedte());
	}
	
	public void schaal(int percentage) {
		if(percentage < 1 || percentage > 200) {
			throw new IllegalArgumentException("1 < schaal < 200");
		}
		this.setBreedte(this.getBreedte() * percentage);
		this.setLengte(this.getLengte() * percentage);
	}
	
	

}
