package cui;

import java.util.Scanner;

import domein.Boek;

public class BoekApplicatie {
	
	private static Boek[] boeken;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boeken = maakBoekenCollectieAan();
		
		System.out.println(geefOverzichtBoekenCollectie(boeken));
		
		System.out.print("Geef het aantal .. in:");
		Scanner invoer = new Scanner(System.in);
		int aantalV = invoer.nextInt();
		
		int[][] verkoopcijfers = new int [3][3];
		
		
			
		vulVerkoopcijfersVanAlleVerkopersAan(verkoopcijfers, boeken);
			
			
		System.out.println(geefOverzichtVerkoopcijfers(verkoopcijfers));			
		
		
		invoer.close();
		
		
		

	}
	
	private static Boek[] maakBoekenCollectieAan() {
		
		Boek[] boeken = new Boek[3];
		String[] titels = { "Het diner", "Gran Canaria", "Steve Jobs" };
		String[] auteurs = { "Herman Koch", "Michelin", "Walter Isaacson" };
		double[] prijzen = { 15.95, 9.95, 15.99 };
		
		for(int i = 0; i<3; i++) {

			boeken[i] = new Boek(prijzen[i],titels[i],auteurs[i]);
		}
		
		return boeken;
	}
	
	private static String geefOverzichtBoekenCollectie(Boek[] boeken) {
		String output="";
		for(Boek bk: boeken) {
			output+=String.format("%s %s van %s kost %.2f%n", bk.getClass().getSimpleName(), bk.getTitel(), bk.getAuteur(), bk.getPrijs());
		}
		return output;
	}
	
	
	private static void vulVerkoopcijfersVanVerkoperAan(int[] verkoopcijfersEenVerkoper, Boek[] boeken) {
		for(int i = 0; i<3; i++) {
			System.out.printf("Geef het aantal .. in voor %s%n:", boeken[i].getTitel());
			Scanner invoer = new Scanner(System.in);
			int input = invoer.nextInt();
			verkoopcijfersEenVerkoper[i] = input;
		}
	}
	
	private static void vulVerkoopcijfersVanAlleVerkopersAan(int[][] verkoopcijfers, Boek[] boeken) {
		for(int i = 0; i<3; i++) {
			System.out.printf("verkoper %d:", i+1);
			vulVerkoopcijfersVanVerkoperAan(verkoopcijfers[i], boeken);
		}
	}
	
	private static String geefOverzichtVerkoopcijfers(int[][] verkoopcijfers) {
		return("tijd op");
	}

}
