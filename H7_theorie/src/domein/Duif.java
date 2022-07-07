package domein;

public class Duif extends Huisdier {
	
	private final long ringnr;

	public Duif(String naam, long ringnr) {
		super(naam);
		controleerRingnr(ringnr);
		this.ringnr = ringnr;
		// TODO Auto-generated constructor stub
	}

	public long getRingnr() {
		return ringnr;
	}
	
	@Override
	public String maakGeluid() {
		return "roekoekoe";
	}
	
	private void controleerRingnr(long ringnr) {
		if(ringnr <= 19000000000L || ringnr > 99999999999L) {
			throw new IllegalArgumentException("Geen geldig ringnummer");
		}
	}
	
	public String toString() {
		return String.format("%s met ringnummer %d", super.toString(), ringnr);
	}
	
	

}
