package cui;

import java.util.Scanner;

public class Postkantoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner invoer = new Scanner(System.in);
		int counter = 0;
		int gewicht;
		String output="";
		
		do {
			
			System.out.print("Geef het gewicht in gram (-10 om te stoppen:");
			gewicht = invoer.nextInt();
			if(gewicht != -10) {
				counter++;
				if(gewicht > 0 && gewicht <= 2000) {	// brief
					System.out.print("Geef de lengte:");
					double lengte = invoer.nextDouble();
					System.out.print("Geef de breedte:");
					double breedte = invoer.nextDouble();
					char categorie;
					// bepaal prijs
					if(gewicht>1000 && gewicht<2000) {
						categorie = 'A';
					}
					else if(gewicht>350 && gewicht<1000) {
						categorie = 'B';
					}
					else if(gewicht>100 && gewicht<350) {
						categorie = 'C';
					}
					else {
						categorie = 'D';
					}
					
					double prijs;
					
					switch(categorie) {
					case 'A': prijs = 5.4; break;
					case 'B': prijs = 3.9; break;
					case 'C': prijs = 2.3; break;
					case 'D': prijs = 1.5; break;
					default: prijs=0.0;
					}
					
					// is de brief genorm
					if(lengte <=22 && breedte <=11) {//ja
						prijs/=2;
						output+=String.format("%d\t%d\t%c\t%s\t%.2f\n", counter,gewicht,categorie,"ja",prijs);
						
					}
					else {//nee
						output+=String.format("%d\t%d\t%c\t%s\t%.2f\n", counter,gewicht,categorie,"nee",prijs);
					}
					
					
					
					
					
				}
				else {	//pakket
					
				}
			}
			
			
		}while(gewicht != 10 && counter < 6);
		
		//output
		if(gewicht==-10 && counter==0) {
			System.out.println("Geen enkele brief verstuurd vandaag!");
		}
		else {
			System.out.println("NR BRIEF\tGEWICHT IN GRAM\tGEWICHTSCATEGORIE\tGENORMALISEERD?\tPRIJS IN EURO\n");
			System.out.print(output);
		}
		
		
		
		invoer.close();
		

	}

}
