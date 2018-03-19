import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {
	
	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected boolean isZichtbaar;
	ArrayList<IReageerder> reageerdersLijst = new ArrayList<>();
	
	public WeergaveObject(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
	}
	
	public void doeStap() {
		x++;
		if (x > 400) {
			x = 0;
		}
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);
	
	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		System.out.println("MouseX: " + mouseX);
		System.out.println("MouseY: " + mouseY);
	}
	
	protected abstract boolean isMuisBinnen(int mouseX, int mouseY);
	
	protected void behandelMousePressedGebeurtenis() {
		for (IReageerder r : reageerdersLijst) {
			r.doeActie();
		}
	}
	
	public void voegReageerderToe(IReageerder reageerder) {
		reageerdersLijst.add(reageerder);
	}
	
	public void verwijderReageerder(IReageerder reageerder) {
		reageerdersLijst.remove(reageerder);
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVx() {
		return vx;
	}

	public void setVx(float vx) {
		this.vx = vx;
	}

	public float getVy() {
		return vy;
	}

	public void setVy(float vy) {
		this.vy = vy;
	}

	public float getAx() {
		return ax;
	}

	public void setAx(float ax) {
		this.ax = ax;
	}

	public float getAy() {
		return ay;
	}

	public void setAy(float ay) {
		this.ay = ay;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}
	
	public ArrayList<IReageerder> getReageerdersLijst() {
		return reageerdersLijst;
	}

	public void setReageerdersLijst(ArrayList<IReageerder> reageerdersLijst) {
		this.reageerdersLijst = reageerdersLijst;
	}
}
