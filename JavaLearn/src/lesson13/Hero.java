package lesson13;

public class Hero {
  private int hp;
  // String name;
  // Sword sword;

  private String name;
  public String getName() {
    return this.name;
  }
  public void getName(String name) {
    if (name == null) { //名前にnullが代入されそうになった！
      throw new IllegalArgumentException("名前がnullである。処理中断！！");
    }
    if (name.length() <= 1) { //短すぎる名前が設定されそうになった！
      throw new IllegalArgumentException("名前が短すぎる。処理中断。");
    }
    if (name.length() >= 8) { //長すぎる名前が設定されそうになった！
      throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
    }
    this.name = name; //検査完了。代入しても大丈夫
  }

  public void bye() {
    System.out.println("勇者は別れを告げた");
  }
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです！！");
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージをあたえた！！！");
    m.hp -= 10;
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0 ) {
      this.die();
    }
  }
}