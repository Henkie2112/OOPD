Damsteen lol;
Damsteen lol2;

void setup() {
  size(500, 500);
  lol = new Damsteen(100, 100, 50, 0);
  lol2 = new Damsteen(200, 200, 50, 255);
}

void draw() {
  background(125);
  lol.tekenDamSteen();
  lol2.tekenDamSteen();
}