package lesson11;

public class Character {
  String name;
  int hp;

  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！！！");
  }

  //戦う
  public abstract void attack(Matango m) {
    //Hero.javaに変更
    // System.out.println(this.name + "の攻撃！");
    // m.hp -= ??; //ここを記述しようとして手が止まる
    // System.out.println("敵に？？ポイントのダメージをあたえた！");
  }
  /*
  未来の開発者様へ
  私はCharacterクラス開発者、ミナトです。

  このクラスは、普通のクラスのようにnewして使う為のものではありません。
  HeroやWizardなどの職業クラスを皆様が作る際に少しでもラクができるように、全職業クラスに共通するフィールドやメソッドを備えた「継承の材料」です

  このクラスを継承して、必要なフィールドやメソッドを追加することで、それぞれの職業クラスを完成させてください。
  逆に言えば、このCharacterクラスは、それ自体では未完成のクラスです。
  例えばattackメソッドは中身が確定できないので空にしてあります。
  よって、このクラスをnewして実際に利用（冒険させてり、戦闘させたり）しないでください。不具合の原因になります。
  */
}