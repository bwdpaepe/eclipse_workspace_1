package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

class RechthoekTest {

	@Test
	public void maakRechthoek_rechthoekGemaakt_getLengteEnBreedte() {
		//arrange & Act
		Rechthoek rh = new Rechthoek(4,3);
		
		//assert
		Assertions.assertEquals(4.0, rh.getLengte());
		Assertions.assertEquals(3.0, rh.getBreedte());
		
	}
	
	@Test
	public void maakRechthoek_lengteTeKlein_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(-4,3);});
	}
	
	@Test
	public void maakRechthoek_breedteTeKlein_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(4,-3);});
	}
	
	@Test
	public void maakRechthoek_lengteEnBreedteTeKlein_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(-4,-3);});
	}

	@Test
	public void maakRechthoek_lengte0_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(0,3);});
	}
	
	@Test
	public void maakRechthoek_breedte0_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(4,0);});
	}
	
	@Test
	public void maakRechthoek_lengteEnBreedte0_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Rechthoek(0,0);});
	}
	
	@Test
	public void geefOmtrek_omtrekBreedte3Lengte4_omtrek14() {
		//arrange
		Rechthoek rh = new Rechthoek(4,3);
		
		//act
		double omtrek = rh.geefOmtrek();
		
		//assert
		Assertions.assertEquals(14.0, omtrek);
	}

	@Test
	public void geefOppervlakte_oppervlakteBreedte3Lengte4_oppervlakte12() {
		//arrange
		Rechthoek rh = new Rechthoek(4,3);
		
		//act
		double oppervlakte = rh.geefOppervlakte();
		
		//assert
		Assertions.assertEquals(12.0, oppervlakte);

	}
	
	@ParameterizedTest
	@ValueSource(ints = {-100,300,0,201})
	public void schaal_slechteWaarden_exception(int percentage) {
		//arrange
		Rechthoek rh = new Rechthoek(4,3);
		
		//act & assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {rh.schaal(percentage);});
	}

//	@Test
//	public void schaal_teKlein_exception() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void schaal_teGroot_exception() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void schaal_ondergrens_exception() {
//		fail("Not yet implemented");
//	}
//	
//
//	@Test
//	public void schaal_bovengrens_exception() {
//		fail("Not yet implemented");
//	}
	

	@Test
	public void schaal_schaal10Breedte3Lengte4_Breedte30Lengte40() {
		//arrange
		Rechthoek rh = new Rechthoek(4,3);
		
		//act
		rh.schaal(10);
		
		//assert
		Assertions.assertEquals(40.0, rh.getLengte());
		Assertions.assertEquals(30.0, rh.getBreedte());
		
	}




}
