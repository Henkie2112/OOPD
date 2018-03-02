
public class StudieAdviseur {

	public static boolean krijgtPositiefStudieadvies(Student s) {
		int cijfers[] = s.getCijfers();
		int voldoendes = 0;
		for (int i = 0; i < cijfers.length; i++) {
			if (cijfers[i] >= 6) {
				voldoendes++;
			}
		}
		if (voldoendes >= 4) {
			return true;
		} else {
			return false;
		}
	}
} 
