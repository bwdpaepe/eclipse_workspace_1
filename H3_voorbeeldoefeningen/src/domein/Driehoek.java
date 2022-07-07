package domein;

public class Driehoek {
	private int a;
	private int b;
	private int c;
	
	public Driehoek(int a, int b, int c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
		
	}

	public int getA() {
		return a;
	}

	private void setA(int a) {
		if(a <= 0) {
			a = 1;
		}
		this.a = a;
	}

	public int getB() {
		return b;
	}

	private void setB(int b) {
		if(b <= 0) {
			b = 1;
		}
		this.b = b;
	}

	public int getC() {
		return c;
	}

	private void setC(int c) {
		if(c <= 0) {
			c = 1;
		}
		this.c = c;
	}
	
	public boolean isRechthoekigeDriehoek() {
		if(Math.pow(this.getA(), 2) + Math.pow(this.getB(), 2) == Math.pow(this.getC(), 2) || Math.pow(this.getA(), 2) + Math.pow(this.getC(), 2) == Math.pow(this.getB(), 2) || Math.pow(this.getC(), 2) + Math.pow(this.getB(), 2) == Math.pow(this.getA(), 2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
