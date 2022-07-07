package domein;

public class MaximumFinder {
	
	public double determineMaximum(double x, double y, double z) {
		double grootste = Math.max(x, y);
		return Math.max(grootste, z);
	}

}
