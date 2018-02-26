
public class ChuckALuck {
	Dobbelbeker dobbelBeker = new Dobbelbeker();
	int[] waarde = new int[3];
	int ogen;
	int inzet;
	int verdubbelaar;
	int ronde;
	
	public ChuckALuck(int ogen, int inzet) {
		this.ogen = ogen;
		this.inzet = inzet;
		this.waarde = dobbelBeker.dobbelen();
		ronde = 0;
	}
	
	public int spel() {
		verdubbelaar = 0;
		int[] stenen = dobbelBeker.dobbelen();
		System.out.println(stenen[0] + "+" + stenen[1] + "+" + stenen[2]);
		for(int i = 0; i < 3; i++) {
			if(waarde[i] == ogen) {
				switch (verdubbelaar) {
				case 0:
					verdubbelaar = 1;
					break;
				case 1:
					verdubbelaar = 2;
					break;
				case 2:
					verdubbelaar = 10;
					break;
				}
			}
		}
		ronde++;
		return inzet * verdubbelaar;
	}
	
	public String toString() {
		return "";
	}
}
