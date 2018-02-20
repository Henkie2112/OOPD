Slider slider1 = new Slider(50, 200, 50, 5);

void setup() {
  size(300, 200);
  
}

void draw() {
  background(0);
  
  int huidigePositie = slider1.bepaalSliderPositie();
  
  slider1.tekenSlider(huidigePositie);
  println(slider1.toString(huidigePositie));
}