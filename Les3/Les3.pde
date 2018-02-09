
Damsteen[] stenen = new Damsteen[4];

void setup() {
  size(500, 500);
  stenen[0] = new Damsteen(50, 50, 50, 0);
  stenen[1] = new Damsteen(100, 100, 50, 0);
  stenen[2] = new Damsteen(100, 50, 50, 255);
  stenen[3] = new Damsteen(50, 100, 50, 255);  
}

void draw() {
  background(#fa8072);
  for (int i = 0; i < stenen.length; i++) {
    stenen[i].tekenDamSteen(); 
  }
}