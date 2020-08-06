package lesson12;

public class Main {
  public static void main(String[] args) {
    // Wizard w = new Wizard(); //Wizardは生き物の一種
    // Character c = w;  //Character型の箱に代入
    // Matango m = new Matango();
    // w.name = "アサカ";
    // w.attack(m);
    // w.fireball(m);

    // Slime s = new Slime(); Monster m = new Slime();
    // s.run(); m.run();

    Monster[] monsters = new Monster[3];
    monsters[0] = new Slime();
    monsters[1] = new Goblin();
    monsters[2] = new DeathBat();

    //冒険開始！！
    //まず宿屋に泊まる
    for (Monster m : monsters) {
      m.run();  //同じ指示を繰り返す
    }
  }
}