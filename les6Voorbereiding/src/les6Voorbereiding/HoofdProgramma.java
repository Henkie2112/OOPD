package les6Voorbereiding;

import java.util.ArrayList;

public class HoofdProgramma {

	public static void main(String[] args) {
		ArrayList<String> lijst = new ArrayList<String>();
		
		for (int i = 0; i < 4; i++) {
			lijst.add("element: " + i);
		}
		
		System.out.println(lijst);
		
		for (String s : lijst) {
			lijst.remove(s);
		}
		
		System.out.println(lijst);	

	}

}
