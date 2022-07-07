package cui;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> decGetallenList = new ArrayList<>();
		decGetallenList.add(5.5);
		decGetallenList.add(7.0);
		decGetallenList.add(4.25);
		
		if(decGetallenList.contains(7.0)) {
			System.out.println("7 komt voor");
		}
		System.out.printf("aantal getallen in list: %d%n", decGetallenList.size());
		
		int index = decGetallenList.indexOf(4.25);
		if(index != -1) {
			System.out.printf("getal 4.25 komt voor op index %d%n", index);
		}
		
	}

}
