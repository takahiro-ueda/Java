package lesson10;

public class SuperHero extends Hero { //「基本的にはHeroと同じ」と宣言
  // String name = "ミナト";
  // int hp = 100;
  // boolean flying;

  // //戦う
  // public void attack(Matango m) {
  //   System.out.println(this.name + "の攻撃！！！");
  //   m.hp -= 5;
  //   System.out.println("5ポイントのダメージをあたえた！！");
  // }

  //飛ぶ
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！！");
  }

  //着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }

  //逃げる
  public void run() {
    System.out.println(this.name + "は撤退した！！！！");
  }
}