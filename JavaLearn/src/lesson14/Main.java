package lesson14;

public class Main {
  public static void main(String[] args) {
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);

    // Object o1 = new Empty();
    // Object o2 = new Hero();
    // Object o3 = new "こんにちは";

    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println(h.toString());
  }
  // public void printAnything(Object o) {
  //   //何型でもいいから、引数を1つ受け取り画面に表示
  //   System.out.println(o.toString());
  // }
}