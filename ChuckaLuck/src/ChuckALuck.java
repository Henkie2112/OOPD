
public class ChuckALuck {
	Dobbelbeker dobbelBeker = new Dobbelbeker();
	int[] waarde = new int[3];
	int inzet;
	int verdubbelaar;
	int ronde = 1;
	int saldo;
	
	public ChuckALuck(int saldo) {
		this.waarde = dobbelBeker.dobbelen();
		this.saldo = saldo;
	}
	
	public int spel(int geluksGetal, int inzet) {
		verdubbelaar = -1;
		int[] stenen = dobbelBeker.dobbelen();
		System.out.println("ronde: " + ronde);
		System.out.println("Saldo: " + saldo);
		System.out.println(stenen[0] + "+" + stenen[1] + "+" + stenen[2]);
		for(int i = 0; i < 3; i++) {
			if(waarde[i] == geluksGetal) {
				switch (verdubbelaar) {
				case -1:
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
		inzet = inzet * verdubbelaar;
		saldo += inzet;
		return inzet;
	}
	
	public String toString() {
		return "";
	}
}
