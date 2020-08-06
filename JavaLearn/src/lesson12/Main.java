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

    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Hero();
    c[3] = new Hero();
    c[4] = new Hero();

    //冒険開始！！
    //まず宿屋に泊まる
    for (Character ch : c) {  //1名ずつ順に取り出し
      ch.hp += 50;  //HPを50回復する
    }
  }
}