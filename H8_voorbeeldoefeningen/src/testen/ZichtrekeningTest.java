package testen;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Zichtrekening;

class ZichtrekeningTest {

	@Test
	public void maakZichtrekening_zichtrekeningGemaakt_saldo0() {
		//arrange & act
		Zichtrekening zr = new Zichtrekening();
		
		//assert
		Assertions.assertEquals(BigDecimal.ZERO, zr.getSaldo());
	}

	@Test
	public void storten_200GestortOpNieuweRekening_saldo200() {
		//arrange
		Zichtrekening zr = new Zichtrekening();
		
		//act
		zr.storten(new BigDecimal(200));
		
		//assert
		Assertions.assertEquals(new BigDecimal(200), zr.getSaldo());
	}
	
	@Test
	public void storten_negatiefGetal_exception() {
		//arrange
		Zichtrekening zr = new Zichtrekening();
		
		//act && assert
		Assertions.assertThrows(IllegalArgumentException.class,() -> {zr.storten(new BigDecimal(-1));});
		
		
		
		
	}
	
	@Test
	public void storten_null_exception() {
		//arrange
		Zichtrekening zr = new Zichtrekening();
		
		//act && assert
		Assertions.assertThrows(IllegalArgumentException.class,() -> {zr.storten(null);});
		
		
		
		
	}
	

}
