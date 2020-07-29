public class lesson5 {
  // public static void main(String[] args) {
  //   add(100, 20); //100と20を渡してaddメソッドを呼び出す
  //   add(200, 50); //200と50を渡してaddメソッドを呼び出す
  // }
  // //複数の値を受け取るaddメソッド
  // public static void add(int x, int y) {
  //   int ans = x + y;
  //   System.out.println(x + "+" + y + "=" + ans);
  // }
  public static void main(String[] args) {
    int x = 100;  //addメソッドで使用するつもり
    int y = 10; //addメソッドで使用するつもり
    add();  addメソッドを呼び出す
  }
  public static void add() {
    int ans = x + y;  //ここで使用するつもり(エラー)
    System.out.println(x + "+" + y + "=" + ans);
  }
  //mainメソッド内で宣言した変数xとyは、mainメソッドのブロックの中でしか使用できない
}