//次にHeroクラスを定義する
public class Hero9 {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！！！");
    System.out.println("敵に5ポイントのダメージをあたえた！！！");
  }
  public Hero(String name) {
    this.hp = 100;  //hpフィールドを100で初期化
    this.name = name; //引数の値でnameフィールドを初期化
  }
}