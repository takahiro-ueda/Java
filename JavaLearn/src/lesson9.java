public class lesson9 {
  public static void main(String[] args) {
    // Hero h1 = new Hero();
    // h1.name = "ミナト";
    // h1.hp = 100;
    // Hero h2 = new Hero();
    // h2.name = "アサカ";
    // h2.hp = 100;
    // Wizard w = new Wizard();
    // w name = "スガワラ";
    // w.hp = 50;
    // w.heal(h1); //ミナトを回復させる(HP: 100 → 110)
    // w.heal(h2); //アサカを回復させる(HP: 100 → 110)
    // w.heal(h2); //アサカを回復させる(HP: 110 → 120)

    Hero h1 = new Hero("ミナト");  //インスタンス生成と同時にコンストラクタによってHPに１００が代入される
    System.out.println(h1.name); //「ミナト」と表示される
    Hero h2 = new Hero(); //引数がないのでコンストラクタ2が呼び出される
    System.out.println(h2.name);
  }
}