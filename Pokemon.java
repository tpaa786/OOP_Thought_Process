public class Pokemon {
  
  // you dont have to give name / level
  private String name;
  private int level;

  // if no name / level is given
  public Pokemon() {
    this.name = "";
    this.level = 1;
  }

  // name/level must be given
  public Pokemon(String name, int level) {
    this.name = name;
    this.level = level;
  }

  public void details() {
    System.out.println("Pokemon " + this.name + " is level " + this.level);
  }

  public void attack() {
    System.out.println(this.name + " attack!");
    // increase level after attack
    this.level++;
  }

}

