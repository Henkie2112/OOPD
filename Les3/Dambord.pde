class Dambord {
  Damsteen[] stenen = new Damsteen[4];

  Dambord() {
    stenen[0] = new Damsteen(50, 50, 50, 0);
    stenen[1] = new Damsteen(100, 100, 50, 0);
    stenen[2] = new Damsteen(100, 50, 50, 255);
    stenen[3] = new Damsteen(50, 100, 50, 255);
  }

  void tekenDamstenen() {
    for (int i = 0; i < stenen.length; i++) {
      stenen[i].tekenDamSteen();
    }
  }
}