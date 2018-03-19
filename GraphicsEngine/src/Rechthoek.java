import processing.core.PApplet;

public class Rechthoek extends Figuur {

	
	public Rechthoek(float x, float y, float breedte, float hoogte, int vulKleur) {
		super(x, y, breedte, hoogte, vulKleur);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		app.fill(getVulKleur());
		app.rect(startX + x, startY + y, breedte, hoogte);
	}

	@Override
	protected boolean isMuisBinnen(int mouseX, int mouseY) {
		if (mouseX >= x && mouseX < x + breedte && mouseY >= y && mouseY < y + hoogte) {
			return true;
		}
		else {
			return false;
		}
	}

	

}
