package cui;

public class InitArray2DimVb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5}};
		
		System.out.println("values in array by row are:\n");
		String output = "";
		
		for(int row = 0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++) {
				output += String.format("%d ", array[row][column]);
			}
			output += "\n";
		}
		
		System.out.printf(output);

	}

}
