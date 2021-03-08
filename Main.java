class Main {
  public static void main(String[] args) {
    
    // first instance
    Pokemon p1 = new Pokemon("Pokemon",10);

    p1.details();
    p1.attack();
    p1.details();

    // second instance
    Pokemon p2 = new Pokemon("Eevee",12);

    p2.attack();
    p2.details();

    //everything is a class in java (excluding boolean . ints and stuff) strings definitely

  }
}