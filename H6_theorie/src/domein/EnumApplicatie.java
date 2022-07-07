package domein;

import java.security.SecureRandom;
import java.util.EnumSet;

import utils.Dag;
import utils.Dag2;

public class EnumApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Dag d: Dag.values()) {
			System.out.println(d.name());
		}
		
		System.out.println("Lang weekend");
		for(Dag d: EnumSet.range(Dag.VRIJDAG, Dag.ZONDAG)) {
			System.out.println(d.name());
		}
		
		for(Dag2 d: Dag2.values()) {
			System.out.println(String.format("Dag %d: %s", d.getDagNr(), d.name()));;
		}
		for(Dag2 d: Dag2.values()) {
			System.out.println(String.format("Dag %d: %s", d.getDagNr(), d));;
		}
		
		SecureRandom s = new SecureRandom();
		int getal;
		Dag d;
		
		for(int i = 0; i < 10; i++) {
			getal = s.nextInt(7);
			d = Dag.values()[getal];
			System.out.println(String.format("Dagnummer %d: %s", getal + 1, d.name()));
		}
		
		d = Dag.values()[3];
		System.out.println(d);

	}

}
