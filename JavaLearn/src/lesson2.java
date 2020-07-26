public class lesson2 {
  public static void main(String[] args) {
    //++や--は、他の演算子と一緒に使わない！
    int a = 10;
    int b = 10;
    System.out.println(++a + 50); /* ①変数aの値が1増える,②それに50を加えたものが画面に表示される*/
    System.out.println(b++ + 50); /* ①変数bに50を加えたものが画面に表示される, ②変数bの値が1増える*/
  }
}