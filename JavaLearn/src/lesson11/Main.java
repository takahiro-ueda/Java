package lesson11;

public class Main {
  public static void main(String[] args) {
    Character c = new Character();  //HeroやWizardではなくCharacterをnewしてしまった！
    Matango m = new Matango('A');
    c.attack(m);  //中身がないので何も動かない！
  }
}