public class Player{
  int number;
  String name;
  Skill skill;
  
  Player(int number, String name, Skill skill){
    this.number = number;
    this.name = name;
    this.skill = skill;
  }

  public boolean equals(Object o){
    if(o instanceof Player){
     Player a = (Player) o;
        
    return this.name.equals(a.name) &&
           this.number == a.number &&
           this.skill == a.skill;
    }
    else
      return false;
  }
  
    public String toString(){
      return "Player: " + this.name + "\nNumber: " + this.number + "\nSkill: " +
              this.skill.toString();
    }

}