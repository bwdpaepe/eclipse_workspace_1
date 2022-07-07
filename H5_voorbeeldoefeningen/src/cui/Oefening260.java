package cui;

public class Oefening260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] omzet = {360,2100,450,1450,650,780,321,1200,560,1850,960,420};
		//Arrays.sort(omzet);
		int minimum = Integer.MAX_VALUE;
		int min_index = -999;
		int maximum = Integer.MIN_VALUE;
		int max_index = -999;
		
		
		for(int i = 0; i < omzet.length; i++) {
			if(omzet[i] > maximum) {
				maximum = omzet[i];
				max_index = i;
				
			}
			
			if(omzet[i] < minimum) {
				minimum = omzet[i];
				min_index = i;
				
			}
		}
		
		System.out.printf("Hoogste omzet %d in maand %d%n", maximum, max_index + 1);
		System.out.printf("Laagste omzet %d in maand %d%n", minimum, min_index + 1);
		

	}

}
