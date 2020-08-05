package lesson11;

public class Hero extends Character {
  public void attack(Matango m) { //attackのtが1文字足りずオーバーライドになっていない！！
    System.out.println(this.name + "の攻撃！！！");
    System.out.println("敵に10ポイントのダメージをあたえた！！");
    m.hp -= 10;
  }
}