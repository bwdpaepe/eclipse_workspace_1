package domein;

public class VoorbeeldStatic {
	private static int aantal;
	private final int id;
	
	public VoorbeeldStatic() {
		this.id = ++aantal;
	}
	
	public static int getAantal() {
		return aantal;
	}
	
	public int getId() {
		return this.id;
	}
}
