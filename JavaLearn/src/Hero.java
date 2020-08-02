public class Hero {
  //属性の定義
  String name;  //名前の宣言
  int hp; //HPの宣言

  //操作の定義
  // public void attack() {}
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  // public void sit(int sec) {}
  // public void slip() {}
  // public void run () {}
}