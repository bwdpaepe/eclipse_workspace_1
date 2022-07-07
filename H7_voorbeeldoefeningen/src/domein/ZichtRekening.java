package domein;

public class ZichtRekening extends Rekening {
	
	private double maxKredietOnderNul;

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		this.setMaxKredietOnderNul(maxKredietOnderNul);
		// TODO Auto-generated constructor stub
	}

	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}

	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if(maxKredietOnderNul > super.getSaldo() || maxKredietOnderNul >= 0) {
			throw new IllegalArgumentException("negatief en kleiner en gelijk aan huidig saldo");
		}
		this.maxKredietOnderNul = maxKredietOnderNul;
	}
	
	@Override
	public boolean haalAf(double bedrag)
    {
		if(super.getSaldo() - bedrag >= this.getMaxKredietOnderNul()) {
			return super.haalAf(bedrag);
		}
		return false;
		
    }
	
	@Override
	public String toString()
    {
        

        return String.format("%s. Max krediet onder nul = %.2f", super.toString(), this.getMaxKredietOnderNul());
    }
	
	

}
