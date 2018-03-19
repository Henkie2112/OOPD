import java.util.ArrayList;

import processing.core.PApplet;

public class WeergaveObjectContainer extends WeergaveObject {
	
	ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();	

	public WeergaveObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}
	
	public void geefWeer(PApplet app, float startX, float startY) {
		for(WeergaveObject w : weergaveLijst) {
			w.geefWeer(app, startX + w.x, startY + w.y);
		}
	}
	
	public void voegToe(WeergaveObject vorm) {
		weergaveLijst.add(vorm);
	}	
	
	public void verwijder(WeergaveObject vorm) {
		weergaveLijst.remove(vorm);
	}

	@Override
	protected boolean isMuisBinnen(int mouseX, int mouseY) {
		for(WeergaveObject w : weergaveLijst) {
			if(w.isMuisBinnen(mouseX - (int) x, mouseY - (int) y)) {
				w.behandelMousePressedGebeurtenis();
				return true;
			}
		}
		return false;
	}

}
