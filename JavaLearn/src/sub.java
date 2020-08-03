public class sub {
  public static void main(String[] args) {
    //  1.勇者を生成
    Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hにいれる
    //  2.フィールドに初期値をセット
    h.name = "湊";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
  }
}