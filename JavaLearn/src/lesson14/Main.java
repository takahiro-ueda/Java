package lesson14;

public class Main {
  public static void main(String[] args) {
    Hero.setRandomMoney();
    System.out.println(Hero.money); //ランダムな金額を表示
    Hero h1 = new Hero();
    System.out.println(h1.money); //同じ額を表示

    //1人も勇者を生み出していない状況で・・・・
    // Hero.money = 100;
    // System.out.println(Hero.money);

    // Hero h1 = new Hero(); //1人目の勇者
    // Hero h2 = new Hero(); //2人目の勇者
    // Hero.money = 100;
    // System.out.println(Hero.money); //クラスHeroの箱moneyを表示
    // System.out.println(h1.money);  //インスタンスh1の箱hpを表示
    // h1.money = 300;
    // System.out.println(h2.money);
  }
}