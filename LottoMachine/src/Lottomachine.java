
public class Lottomachine {
	
	private Glazenbol trekker;
	private Scorebord scorebord;
	
	public Lottomachine() {
		trekker = new Glazenbol();
		scorebord = new Scorebord();
	}
	
	public void voerTrekkingUit() {
		trekker.verzamelAlleBallen();
		scorebord.maakLeeg();
		for (int i = 0; i < 6; i++) {
			scorebord.plaatsBal(trekker.schepBal());
		}
		scorebord.plaatsBonusBal(trekker.schepBal());
		scorebord.sorteerBallen();
		scorebord.printScoreBord();
	}
}
