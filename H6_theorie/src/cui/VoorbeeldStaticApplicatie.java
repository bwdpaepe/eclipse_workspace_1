package cui;

import domein.VoorbeeldStatic;

public class VoorbeeldStaticApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Aantal objecten: %d%n",  VoorbeeldStatic.getAantal());
		
		VoorbeeldStatic obj1 = new VoorbeeldStatic();
		VoorbeeldStatic obj2 = new VoorbeeldStatic();
		VoorbeeldStatic obj3 = new VoorbeeldStatic();
		
		System.out.printf("ID van object 1 is %d%n",  obj1.getId());
		System.out.printf("ID van object 2 is %d%n",  obj2.getId());
		System.out.printf("ID van object 3 is %d%n",  obj3.getId());
		
		System.out.printf("Aantal objecten: %d%n",  VoorbeeldStatic.getAantal());

	}

}
