package domein;

public class SpaarRekening extends Rekening {
	
	private static double aangroeiIntrest;

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
		
		// TODO Auto-generated constructor stub
	}

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	public final static void setAangroeiIntrest(double aangroeiIntrest) {
		if(aangroeiIntrest < 0) {
			throw new IllegalArgumentException("niet onder 0");
		}
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	
	@Override
	public boolean haalAf(double bedrag)
    {
		if(super.getSaldo() - bedrag >= 0) {
			return super.haalAf(bedrag);
		}
		return false;
		
    }
	
	@Override
	public String toString()
    {
        

        return String.format("%s. Aangroeiintrest = %.2f", super.toString(), SpaarRekening.getAangroeiIntrest());
    }
	

}
