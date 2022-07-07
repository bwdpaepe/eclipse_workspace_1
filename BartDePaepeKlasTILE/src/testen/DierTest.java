package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Dier;

class DierTest {
	
	private Dier dier;
	
	@BeforeEach
	public void setup() {
		dier = new Dier("Vlaamse Reus");
	}

	@Test
	public void maakDier_rasOK_dierGemaakt() {
		Assertions.assertEquals("Vlaamse Reus", dier.getRas());
	}

	@Test
	public void maakDier_initieleVetmassaOK_dierGemaakt() {
		Assertions.assertEquals(100.0, dier.getVetmassa());
	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"    "})
	public void maakDier_rasLeeg_exception(String ras) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Dier(ras));
	}

	@Test
	public void gaOpJacht_teWeinigTijd_exception() {

		//assign & assert
		Assertions.assertThrows(IllegalArgumentException.class,()->dier.gaOpJacht(0),"Ongeldige tijd");
		
	}
	
	@Test
	public void gaOpJacht_teWeinigReserve_exception() {

		//assign & assert
		Assertions.assertThrows(IllegalArgumentException.class,()->dier.gaOpJacht(Integer.MAX_VALUE),"Te weinig reserve");
		
	}
	
	@Test
	public void gaOpJacht_jachtLukt_returnVermassa() {
		//arrange

		//assign
		dier.gaOpJacht(100);
		
		//assert
		Assertions.assertEquals(75, dier.getVetmassa());
		
	}

}
