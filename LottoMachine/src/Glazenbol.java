import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
	
	private ArrayList<Lottobal> ballen;
	
	public Glazenbol(){
		ballen = new ArrayList<Lottobal>();
	}
	
	public void verzamelAlleBallen() {
		for (int i = 0; i < 45; i++) {
			Lottobal bal = new Lottobal(i+1);
			ballen.add(bal);
		}
	}
	
	public Lottobal schepBal() {
		Random rand = new Random();
		int random = rand.nextInt(ballen.size() - 1);
		
		Lottobal bal = ballen.get(random);
		ballen.remove(random);

		
		return bal;	
	}
}
