package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Hoofdstuk;

class HoofdstukTest {
	
	private Hoofdstuk hoofdstuk;
	
	@BeforeEach
	public void setup() {
		hoofdstuk = new Hoofdstuk(); 
	}

//	@Test
//	void setTitel_titelLeeg_returnFalse() {
//		fail("Not yet implemented");
//	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"   ","a","A"})
	public void setTitel_ongeldigeWaarden_gooitException(String titel) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {hoofdstuk.setTitel(titel);});
	}
}
