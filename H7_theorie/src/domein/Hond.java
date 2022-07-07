package domein;

public class Hond extends Huisdier {

	public Hond(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String maakGeluid() {
		return "Waf waf waf" + super.maakGeluid();
	}
	
	public String kwispel() {
		return "kwispel kwispel kwispel ...";
	}

}
