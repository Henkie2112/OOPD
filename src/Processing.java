import processing.core.PApplet;

public class Processing extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] {"Processing"} );

	}
	
	public void settings() {
		size(400, 400);
	}
	
	public void setup() {		
		
	}
	
	public void draw() {
		background(0);
		for (int j = 0; j < 6; j++) {			
			for (int i = 0; i < 6; i++) {
				fill(random(0, 255), random(0, 255), random(0,255));
				rect(50 + i * 50, 50 + j * 50, 50, 50);
			}
		}
		delay(100);
	}

}
