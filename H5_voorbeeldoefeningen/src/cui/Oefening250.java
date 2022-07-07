package cui;

import java.util.Scanner;

public class Oefening250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			System.out.printf("geef getal %d: ", i + 1);
			array[i] = scanner.nextInt();
		}
		System.out.print("geef nog een extra getal: ");
		int extraGetal = scanner.nextInt();
		System.out.println("deze getallen zijn strikt groter dan 55:");
		System.out.printf("%s%8s%n", "index", "waarde");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > extraGetal) {
				System.out.printf("%5d%8d%n", i, array[i]);
			}

		}
		

	}

}
