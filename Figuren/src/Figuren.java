import processing.core.PApplet;

public class Figuren extends PApplet{
	
	public static void main(String[] args) {
		
		PApplet.main(new String[] {"Figuren"});
	}
	
	private Vormpjes c;
	private Vormpjes r;
	
	public void settings() {
		size(500, 500);
	}
	
	public void setup() {
		background(255, 128, 114);
		c = new Cirkel(width / 2, height / 2, 50);
		r = new Rechthoek(40, 40, 50, 50);
		c.setVersnelling(0.5f, 0.5f);
	}
	
	public void draw() {
		background(255, 128, 114);
		c.setKleur(0xFFF00000);
		c.teken(this);
		r.teken(this);
	}
	
	public void mousePressed() {
		c.doeStap();
	}
}
