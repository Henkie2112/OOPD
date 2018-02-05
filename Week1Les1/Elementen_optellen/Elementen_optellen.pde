void setup() {
  int[] getallen = {1,2,3,4,5};
  int[] getallen2 = {6,7,8,9,10};
  println(telElementenOp(getallen, getallen2));
}

int[] telElementenOp(int[] getal, int[] getal2) {
  int getal3[] = new int [getal.length];
   for(int i = 0; i < getal.length; i++) {
      getal3[i] = getal[i] + getal2[i];
   }
   return getal3;
}