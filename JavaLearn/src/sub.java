public class sub {
  public static void main(String[] args) {
    //  1.勇者を生成
    Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hにいれる

    //  2.フィールドに初期値をセット
    h.name = "湊";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");

    Matango m1 = new Matango(); //お化けキノコA(１匹目)を生成し初期化
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango(); //お化けキノコ(2匹目)を生成し初期化
    m2.hp = 48;
    m2.suffix = 'B';

    //  冒険の始まり
    h.slip(); //勇者は転ぶ
    m1.run(); //お化けきのこAが逃げる
    m2.run(); //お化けキノコBが逃げる
    h.run();  //勇者も逃げろ

    // int yusha_hp = 100;
    // int matango1_hp = 50;
    // int matango2_hp = 48;
    // String yusha_name = "ミナト";
    // int matango1_level = 10;
    // int matango2_level = 10;
    // System.out.println(yusha_name + "は5秒座った");
    // yusha_hp += 5;
    // System.out.println("HPが" + yusha_hp + "ポイント回復した！");
    // yusha_hp -= 5;
    // System.out.println(yusha_name + "は、転んだ！！");
    // System.out.println("5のダメージ");
  }
}