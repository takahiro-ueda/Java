package lesson13;

public class King {
  public void talk(Hero h) {
    System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ。");
    System.out.println("王様：長旅疲れたであろう。");
    System.out.println("王様：まずは城下町を見てくると良い。ではまた会おう。");
    h.die();  //ここが不具合の原因。勇者が死ぬ！
  }
}