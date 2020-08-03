public class Hero {
  //属性の定義
  String name;  //名前の宣言
  int hp; //HPの宣言

  //操作の定義
  // public void attack() {}
  public void sleep() { //眠るメソッド
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec) {  //座るメソッド
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {  //転ぶメソッド
    this.hp = 5;
    System.out.println(this.name + "は、転んだ！！");
    System.out.println("5のダメージ");
  }
  public void run () {  //逃げるメソッド
    System.out.println(this.name + "は、逃げ出した");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした！！");
  }
}