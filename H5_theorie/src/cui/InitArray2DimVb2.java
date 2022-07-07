package cui;

public class InitArray2DimVb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5}};
		
		System.out.println("values in array by row are:\n");
		String output = "";
		
		for(int[] row: array) {
			for(int column: row) {
				output += String.format("%d ", column);
			}
			output += "\n";
		}
		
		System.out.printf(output);

	}

}
