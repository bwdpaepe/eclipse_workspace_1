package domein;

import java.math.BigDecimal;

public class Zichtrekening {
	private BigDecimal saldo = BigDecimal.ZERO;
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	public void storten(BigDecimal bedrag) {
		if(bedrag == null) {
			throw new IllegalArgumentException("bedrag mag niet null");
		}	
		if(bedrag.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("bedrag moet > 0");
		}
		this.saldo = this.saldo.add(bedrag);
	}

}
