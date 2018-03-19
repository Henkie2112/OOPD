import java.util.ArrayList;

import processing.core.PApplet;

public class RadioknoppenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] {"RadioknoppenApp"});
		
		
	}
	ArrayList<Radioknop> knoppen = new ArrayList<>();
	
	Radioknop r = new Radioknop(this, 100, 100, 40, 40);
	Radioknop r2 = new Radioknop(this, 150, 100, 40, 40);
	Radioknop r3= new Radioknop(this, 200, 100, 40, 40);
	
	public void settings() {
		size(500, 500);
	}
	
	public void setup() {
		knoppen.add(r);
		knoppen.add(r2);
		knoppen.add(r3);
		
		r.voegDoelwitToe(r2);
		r.voegDoelwitToe(r3);
		
		r2.voegDoelwitToe(r);
		r2.voegDoelwitToe(r3);
		
		r3.voegDoelwitToe(r);
		r3.voegDoelwitToe(r2);
		
//		for (Knop dw : knoppen) {
//			for(Knop dw2 : knoppen) {
//				if (dw != dw2) {
//					Radioknop rk = (Radioknop) dw;
//					
//				}
//			}
//		}
	}
	
	public void draw() {
		background(0);
		for(Radioknop r : knoppen) {
			r.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Radioknop r : knoppen) {
			if (r.isMuisOverKnop()) {
				r.handelInteractieAf();
			}				
		}
	}
}
	
