package cui;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {32,27,64,18,95,14,90,70,60,37};
		int[] c;
		c = new int[2];
		int[] d = new int[2];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		int counter=0;
		for(int element: array) {
			System.out.printf("%5d%_d%n", counter, element);
			counter++;
		}

	}

}
