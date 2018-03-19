import processing.core.PApplet;

public class Tekstraam implements IDoelwit {
	
	private PApplet app;
	private String tekst;
	private int x, y;
	
	private boolean isAan;
	
	public Tekstraam (PApplet app, String tekst, int x, int y) {
		this.app = app;
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		isAan = true;
	}
	
	public void schakel() {
		if (isAan) {
			app.fill(0xFFA4C739);
		} 
		else {
			app.fill(255);
		}
	}
	
	public void teken() {
		app.text(tekst, x, y);
	}
}
