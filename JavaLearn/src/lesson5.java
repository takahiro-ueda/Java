public class lesson5 {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(add(add(10, 20), add(30, 40)));
  }
  //※return文は値を戻すだけでなく、メソッドの終了も行います。そのため、return文の後に処理を書いても実行されない
}