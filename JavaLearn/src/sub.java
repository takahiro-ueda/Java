public class sub {
  public static void main(String[] args) {
    //  1.勇者を生成
    Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hにいれる
    //  2.フィールドに初期値をセット
    h.name = "湊";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    //  3.勇者のメソッドを呼び出してゆく
    h.sit(5); //5秒座れ
    h.slip(); //転ぶ
    h.sit(25);  //25座れ
    h.run();  //逃げろ
  }
}