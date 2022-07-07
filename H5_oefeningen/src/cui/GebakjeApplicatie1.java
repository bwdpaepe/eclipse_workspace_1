package cui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Gebakje;

public class GebakjeApplicatie1 {

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
		int[] bestelling = new int[gebakjesArray.length];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < bestelling.length; i++) {
			boolean gaDoor = true;
			while(gaDoor) {
				System.out.printf("Hoeveel %s aan %.2f per stuk wenst u?", gebakjesArray[i].getNaam(),gebakjesArray[i].getPrijs());
				try {
					bestelling[i] = scanner.nextInt();
				}
				catch(InputMismatchException e){
					System.err.println(e);
					System.out.println("Voer het aantal gewenste stuks in als gehele waarde");
				}
				gaDoor = false;
			}
		}
		
		//output
		String output = "";
		for(int i = 0; i < bestelling.length - 1; i++) {
			output += String.format("%d %s, ", bestelling[i],gebakjesArray[i].getNaam());
		}
		output += String.format("%d %s ", bestelling[bestelling.length - 1],gebakjesArray[bestelling.length - 1].getNaam());
		
		System.out.print(output);
	}
	
	

}
