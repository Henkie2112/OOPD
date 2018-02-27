import java.util.ArrayList;

public class Scorebord {
	
	private ArrayList<Lottobal> ballen;
	
	public Scorebord() {
		ballen = new ArrayList<Lottobal>();
	}
	
	public void maakLeeg() {
		while (ballen.size() > 0) {
			ballen.remove(0);
		}
	}
	
	public void plaatsBal(Lottobal bal) {
		ballen.add(bal);
	}
	
	public void plaatsBonusBal(Lottobal bal) {
		ballen.add(bal);
	}
	
	public void sorteerBallen( ) {
		for (int i = ballen.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) { 
	            if (ballen.get(j).getNummer() > ballen.get(j+1).getNummer()) {
	            	Lottobal bal = ballen.get(j);
	                ballen.set(j, ballen.get(j + 1));
	            	ballen.set(j + 1, bal);
	            }
			}
		}
	}
	
	public void printScoreBord() {
		for(Lottobal bal: ballen ) {
			System.out.print(bal + " ");
		}
	}
}
