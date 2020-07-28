public class lesson3 {
  public static void main(String[] args) {
    // boolean tenki = true;  //ここでtrueかfalseを代入
    // if (tenki == true) {
    //   System.out.println("洗濯をします");
    //   System.out.println("散歩をします");
    // } else //1行しかないので波カッコは省略可能
    //   System.out.println("DVDを見ます");
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(4) + 1;
    if (fortune == 1) {
      System.out.println("大吉");
    } else if (fortune == 2) {
      System.out.println("中吉");
    } else if (fortune == 3) {
      System.out.println("吉");
    } else {
      System.out.println("凶");
    }
  }
}