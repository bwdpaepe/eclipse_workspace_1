package cui;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("original array: ");
		for(int element : array) {
			System.out.printf("%5d", element);
		}
		
		modifyArray(array);
		
		System.out.println("modified array: ");
		for(int element : array) {
			System.out.printf("%5d", element);
		}
		
		for(int element : array) {
			
			System.out.printf("ori element: %5d%n", element);
			modifyElement(element);
			System.out.printf("modified element: %5d%n", element);
		}
		
		
		

	}
	
	public static void modifyArray(int[] array2) {
		for (int counter = 0; counter < array2.length; counter++) {
			array2[counter]*=2;
		}
	}
	
	public static void modifyElement(int element) {
		element *= 2;
	}

}
