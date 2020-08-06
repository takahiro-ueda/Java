package lesson12;

public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard(); //Wizardは生き物の一種
    Matango m = new Matango();
    w.name = "アサカ";
    w.attack(m);
    w.fireball(m);
  }
}