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

    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Thief t1 = new Thief();
    Wizard w1 = new Wizard();
    Wizard w2 = new Wizard();
    //冒険開始！！
    //まず宿屋に泊まる
    h1.hp += 50;
    h2.hp += 50;
    t1.hp += 50;
    w1.hp += 50;
    w2.hp += 50;
    /* 
    ※このコードの前提
    ・HeroやWizard、Thiefは、抽象クラスCharacterを継承している。
    ・Characterはnameとhpフィールド、attack()とrun()のメソッドを持つ。
    */
  }
}