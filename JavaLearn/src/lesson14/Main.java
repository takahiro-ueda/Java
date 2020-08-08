package lesson14;

public class Main {
  public static void main(String[] args) {
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);

    // Object o1 = new Empty();
    // Object o2 = new Hero();
    // Object o3 = new "こんにちは";

    Hero h1 = new Hero(); //1人目の勇者
    Hero h2 = new Hero(); //2人目の勇者
    System.out.println(h1.hp);  //インスタンスh1の箱hpを表示
    System.out.println(Hero.money); //クラスHeroの箱moneyを表示
  }
  // public void printAnything(Object o) {
  //   //何型でもいいから、引数を1つ受け取り画面に表示
  //   System.out.println(o.toString());
  // }
}