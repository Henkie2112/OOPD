
import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] {"GraphicsEngineApp"});

	}
	
	protected ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	public WeergaveObjectContainer woc = new WeergaveObjectContainer(50, 50);
	
	
	
	IReageerder i = new HalloReageerder();
	
	public void settings() {
		size(500, 500);
	}
	
	public void setup() {		
		weergaveLijst.add(woc);
		
		Rechthoek r = new Rechthoek(20, 20, 100, 100, 0xFFFFA07A);
		Rechthoek r2 = new Rechthoek(30, 200, 100, 100, 0xFFF4530A);
		Rechthoek r3 = new Rechthoek(25, 30, 100, 100, 0xFFDF501A);
		
		woc.voegToe(r);		
		woc.voegToe(r2);	
		
		woc.voegReageerderToe(i);
	}

	public void draw() {
		background(255);
		for(WeergaveObject w : weergaveLijst) {
			w.geefWeer(this, w.x ,w.y);
			w.doeStap();
		}
	}
	
	public void mousePressed() {
		for (WeergaveObject w : weergaveLijst) {
			if (w.isMuisBinnen(mouseX, mouseY)) {
				w.behandelMousePressedGebeurtenis();			
			}
		}
		
	}
}
