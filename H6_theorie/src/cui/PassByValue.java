package cui;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 45;
		System.out.println("Voor de wissel, in main: a= " + a + " en b = " + b);
		wissel(a,b);
		System.out.println("Na de wissel, in main: a= " + a + " en b = " + b);

	}
	
	private static void wissel(int a, int b) {
		System.out.println("Voor de wissel, in methode: a= " + a + " en b = " + b);
		//wissel de 2 waarden
		int c = a;
		a = b;
		b = c;
		System.out.println("Na de wissel, in methode: a= " + a + " en b = " + b);
	}

}
