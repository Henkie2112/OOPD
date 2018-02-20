class Slider {
  float x, y, breedte, hoogte;
  int nPosities;

  Slider(float y, float breedte, float hoogte, int nPosities) {
    this.y = y;
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.nPosities = nPosities;
    x = ((width - breedte) / 2) * -1;
  }

  void tekenSlider(int positie) {

    float blokjeBreedte = breedte / nPosities;

    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);

    fill(#2257F0);
    rect(x + positie * blokjeBreedte, y - 10, blokjeBreedte, hoogte + 20);
  }

  int bepaalSliderPositie() {
    float blokjeBreedte = breedte / nPosities;

    if (mouseX < x) {
      return 0;
    } else if (mouseX >= breedte + x) {
      return nPosities - 1;
    } else {
      return floor((mouseX  - x) / blokjeBreedte);
    }
  }
  
  String toString(int huidigePositie) {
    return ("Positie = " + huidigePositie);
  }
}