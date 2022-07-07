package domein;

public class TweedehandsCursus extends Cursus {
	
	private int kortingVerkoper;

	public TweedehandsCursus(String olod, String titel, int prijs, int kortingVerkoper) {
		super(olod, titel, prijs);
		// TODO Auto-generated constructor stub
		try {
			this.setKortingVerkoper(kortingVerkoper);
		}
		catch(Exception e) {
			System.err.print(e);
		}
	}

	public int getKortingVerkoper() {
		return kortingVerkoper;
	}

	public void setKortingVerkoper(int kortingVerkoper) throws Exception {
		if(kortingVerkoper < 10) {
			throw new IllegalArgumentException("korting > 10!!!");
		}
		if(kortingVerkoper + Cursus.getStudentenkorting() > 100) {
			throw new Exception("Te veel korting !!!");
		}
		this.kortingVerkoper = kortingVerkoper;
	}
	
	@Override
	public double berekenPrijsNaKorting() {
		double prijs = super.berekenPrijsNaKorting();
		return prijs * (1 - this.getKortingVerkoper()/100.0);
	}
	
	@Override
    public String toString()
    {
		return super.toString();
    }
	
	

}
