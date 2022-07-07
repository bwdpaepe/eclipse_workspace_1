package cui;

public class InitArrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_LENGTH = 10;
		int array[] = new int [ARRAY_LENGTH];
		
		for(int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%d%8d%n", counter, array[counter]);

		}
	}

}
