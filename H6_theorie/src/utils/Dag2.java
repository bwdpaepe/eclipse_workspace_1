package utils;

public enum Dag2 {
	MAANDAG(1),DINSDAG(2),WOENSDAG(3),DONDERDAG(4),VRIJDAG(5),ZATERDAG(6),ZONDAG(7);
	
	private final int dagNr; //moet final
	
	Dag2(int dagNr){
		this.dagNr = dagNr;
	}
	
	public int getDagNr() {
		return this.dagNr;
	}
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
