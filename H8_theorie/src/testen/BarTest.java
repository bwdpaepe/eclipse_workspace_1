package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Bar;

class BarTest {
	
	private Bar bar;
	
	@BeforeEach
	public void setup() {
		bar = new Bar();
	}

	@Test
	public void magAlcoholDrinken_oudGenoeg_returnTrue() {
		//arrange
		//Bar bar = new Bar();
		int leeftijd = 22;
		
		//act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		
		//assert
		assertTrue(resultaat);
			
	}
	
	@Test
	public void magAlcoholDrinken_grensGeval16_returnTrue() {
		//arrange
		//Bar bar = new Bar();
		int leeftijd = 16;
		
		//act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		
		//assert
		assertTrue(resultaat);
			
	}
	
	@Test
	public void magAlcoholDrinken_teJong_returnFalse() {
		//arrange
		//Bar bar = new Bar();
		int leeftijd = 10;
		
		//act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		
		//assert
		assertFalse(resultaat);
			
	}

}
