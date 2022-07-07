package cui;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colorList = new ArrayList<>();
		colorList.add("magenta");
		colorList.add("yellow");
		colorList.add(1, "green");
		
		String oudeKleur = colorList.set(1, "back");
		System.out.printf("o kleur was: %s%n", oudeKleur);
		
		String kleur = colorList.get(2);
		System.out.printf("n kleur was: %s%n", kleur);
		
		colorList.add("black");
		colorList.remove("black");
		
		kleur = colorList.remove(1);
		System.out.printf("De kleur die verw werd was%s%n", kleur);
		
	}

}
