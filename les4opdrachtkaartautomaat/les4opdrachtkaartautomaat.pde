Money film;

void setup() {
  size(600, 500);
  film = new Money(15, 10);
}

void draw() {
  film.tekenKaartje();
}