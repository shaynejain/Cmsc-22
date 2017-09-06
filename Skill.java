public class Skill{
  String shoot;
  String pass;
  String dribble;
  
  Skill(String shoot, String pass, String dribble){
    this.shoot = shoot;
    this.pass = pass;
    this.dribble = dribble;
  }
  
  Skill(){
    this.pass = "Good Passing";
    this.shoot = "Good Power & Accuracy";
    this.dribble = "Good Control";  
  }
  
  public String toString(){
    return "Skill: \n" + "Passing: \n" + this.pass + "Shooting: \n" + this.shoot +
           "Dribbling: \n" + this.dribble;
  
  }
}