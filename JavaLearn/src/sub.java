public class sub {
  public static void main(String[] args) {
    // //  1.勇者を生成
    // Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hにいれる
    // //  2.フィールドに初期値をセット
    // h.name = "湊";
    // h.hp = 100;
    // System.out.println("勇者" + h.name + "を生み出しました！");
    // //  3.勇者のメソッドを呼び出してゆく
    // h.sit(5); //5秒座れ
    // h.slip(); //転ぶ
    // h.sit(25);  //25座れ
    // h.run();  //逃げろ
    int yusha_hp = 100;
    int matango1_hp = 50;
    int matango2_hp = 48;
    String yusha_name = "ミナト";
    int matango1_level = 10;
    int matango2_level = 10;
    System.out.println(yusha_name + "は5秒座った");
    yusha_hp += 5;
    System.out.println("HPが" + yusha_hp + "ポイント回復した！");
    yusha_hp -= 5;
    System.out.println(yusha_name + "は、転んだ！！");
    System.out.println("5のダメージ");
  }
}