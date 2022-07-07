package domein;

import java.time.LocalDateTime;

import domein.Fiets;

public class Verhuring {
	private LocalDateTime van;
	private LocalDateTime tot;
	private Fiets fiets;
	
	public boolean bevatElektrischeFiets() {
		return true;
	}
	

}
