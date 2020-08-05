package lesson11;

public class Dancer extends Character {
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った！！");
  }
  public void attack(Matango m) { //親から継承した「詳細未定のattack()」を上書きする
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
}