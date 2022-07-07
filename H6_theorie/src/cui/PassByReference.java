package cui;

import domein.MijnGetal;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MijnGetal a = new MijnGetal(30);
		MijnGetal b = new MijnGetal(45);
		System.out.println("Voor de wissel, in main: a= " + a.getGetal() + " en b = " + b.getGetal());
		wissel(a,b);
		System.out.println("na de wissel, in main: a= " + a.getGetal() + " en b = " + b.getGetal());
		
		System.out.println("Voor de toekenning, in main: a= " + a.getGetal());
		kenNieuwObjectToe(a);
		System.out.println("Na de toekenning, in main: a= " + a.getGetal());

	}
	
	private static void wissel(MijnGetal a, MijnGetal b) {
		System.out.println("Voor de wissel, in methode: a= " + a.getGetal() + " en b = " + b.getGetal());
		//wissel
		MijnGetal c = new MijnGetal(a.getGetal());
		a.setGetal(b.getGetal());
		b.setGetal(c.getGetal());
		System.out.println("Na de wissel, in methode: a= " + a.getGetal() + " en b = " + b.getGetal());
	}
	
	private static void kenNieuwObjectToe(MijnGetal eenGetal) {
		System.out.println("Voor de toekenning, in methode: getal = " + eenGetal.getGetal());
		eenGetal = new MijnGetal(60);
		System.out.println("Na de toekenning, in methode: getal = " + eenGetal.getGetal());
		
	}

}
