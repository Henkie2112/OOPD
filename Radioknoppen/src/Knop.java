import java.util.ArrayList;

import processing.core.PApplet;

public class Knop {
	
	protected PApplet app;
	protected float x, y, breedte, hoogte;
	protected ArrayList<IDoelwit> doelwitten = new ArrayList<>();
	
	public Knop(PApplet app, float x, float y, float breedte, float hoogte) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
	}
	
	public void voegDoelwitToe(IDoelwit doelwit) {
		doelwitten.add(doelwit);
	}
	
	public void tekenKnop() {
	}
	
	public boolean isMuisOverKnop() {
		return (Boolean) null;
	}
	
	public void handelInteractieAf() {
		doeKnopActie();
	}
	
	protected void doeKnopActie() {
		
	}
}
