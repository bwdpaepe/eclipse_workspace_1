package cui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Gebakje;

public class GebakjeApplicatie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] namen = {"aardbeientaartje", "eclair", "miserable", "hoorntje"};
		double[] eenheidsprijzen = {2.75, 1.5, 2, 1.75};
		Gebakje[] gebakjesArray = new Gebakje[4];
		for(int i = 0; i < gebakjesArray.length; i++) {
			try {
				gebakjesArray[i] = new Gebakje(namen[i], eenheidsprijzen[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(e);
			}
		}
		
		//bestelling
		int[][] bestelling = new int[3][gebakjesArray.length];
		Scanner scanner = new Scanner(System.in);
		for(int klant = 0; klant < 3; klant++) {
			for(int i = 0; i < bestelling[klant].length; i++) {
				boolean gaDoor = true;
				while(gaDoor) {
					System.out.printf("Hoeveel %s aan %.2f per stuk wenst u?", gebakjesArray[i].getNaam(),gebakjesArray[i].getPrijs());
					try {
						bestelling[klant][i] = scanner.nextInt();
					}
					catch(InputMismatchException e){
						System.err.println(e);
						System.out.println("Voer het aantal gewenste stuks in als gehele waarde");
					}
					gaDoor = false;
				}
			}
		}
		
		//totaal
		int[] totaal = new int[gebakjesArray.length];
		for(int[] klant: bestelling) {
			int counter = 0;
			for(int gebakje: klant) {
				totaal[counter] += gebakje;
				
				counter++;
			}
		}
		
		//output
		
		for(int klant = 0; klant < 3; klant++) {
			System.out.printf("Bestelling voor klant %d:%n", klant + 1);
			String output = "";
			for(int i = 0; i < bestelling[klant].length - 1; i++) {
				output += String.format("%d %s,%n", bestelling[klant][i],gebakjesArray[i].getNaam());
			}
		
			output += String.format("%d %s%n", bestelling[klant][bestelling.length - 1],gebakjesArray[bestelling.length - 1].getNaam());
			System.out.print(output);
		}
		
		
		
		System.out.println("totaal\n");
		int counter = 0;
		for(int aantal: totaal) {
			System.out.printf("%d x %s%n", aantal, gebakjesArray[counter].getNaam());
			counter++;
		}
	}

}
