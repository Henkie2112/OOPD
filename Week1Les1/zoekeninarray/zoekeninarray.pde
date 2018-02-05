int[] getallen = {1, 2, 3, 4};

void setup() {
  println(komtGetalVoorIn(5, getallen));
  println(komtGetalVoorIn(2, getallen));
}

boolean komtGetalVoorIn(int getal, int[] lijst) {
  boolean lol = false;
  int i = 0;
  while(i < lijst.length) {
    if(getal == lijst[i]) {
      lol = true;
      i = 100000;
    } else {
     i++;
    } 
  }
  return lol;
}