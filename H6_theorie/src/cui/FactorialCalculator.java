package cui;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("geef waarde:");
		int waarde = scanner.nextInt();
		
		int faculteit = berekenFaculteit(waarde);
		

	}
	
	public static int berekenFaculteit(int x) {
		if(x == 1) {
			return 1;
		}
		
		else {
			return (x * berekenFaculteit(x-1));
		}
		
	}

}
