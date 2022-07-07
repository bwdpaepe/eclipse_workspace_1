package domein;

public class Hoofdstuk {
	private String titel;
	
	public void setTitel(String titel) {
		if(titel == null || titel.trim().isEmpty()) {
			throw new IllegalArgumentException("moet ingevuld zijn");
			
		}
		if(titel.length() < 2) {
			throw new IllegalArgumentException("is te klein");
		}
		this.titel = titel;
	}

}
