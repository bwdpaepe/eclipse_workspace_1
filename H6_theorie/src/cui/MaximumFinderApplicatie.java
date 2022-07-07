package cui;

import java.util.Scanner;

import domein.MaximumFinder;

public class MaximumFinderApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumFinder maxF = new MaximumFinder();
		double number1 = leesDouble("Geef eerste double in: ");
		double number2 = leesDouble("Geef tweede double in: ");
		double number3 = leesDouble("Geef derde double in: ");
		
		double max = maxF.determineMaximum(number1, number2, number3);
		
		drukDouble(max, "Het maximum is ");

	}
	
	private static double leesDouble(String prompt) {
		System.out.println(prompt);
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		return input;
	}
	
	private static void drukDouble(double r, String boodschap) {
		System.out.printf("%s %.2f", boodschap, r);
	}

}
