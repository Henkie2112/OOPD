class Money {
  int prijs, invoer;
  
  Money(int prijs, int invoer) {
    this.prijs = prijs;
    this.invoer = invoer;    
  }
  
  void tekenKaartje() {
    int wisselGeld;
    wisselGeld = wisselen();      
    text(wisselGeld, 300, 100);
    if (check() == true) {
      rect(50, 50, 100, 100);      
    }
  }
  
  boolean check() {
    boolean check = false;
    
    if (invoer >= prijs) {
      check = true;      
    }  
    else {
      check = false; 
    }
    return check;
  }
  
  int wisselen() {
    int verschil = 0;
    
    if (invoer >= prijs) {
     verschil = invoer - prijs;
    } else if (invoer < prijs) {
     verschil = 0; 
    }
    return verschil;
  }
}