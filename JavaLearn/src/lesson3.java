public class lesson3 {
  public static void main(String[] args) {
    for ( int i = 1; i < 10; i++) { //ここで繰り返し回数を決める
      for ( int j = 1; j < 10; j++) {
        System.out.println(i * j); //掛け算の結果を出力
        System.out.println(""); //空白を出力
      }
      System.out.println(""); //改行を出力
    }
  }
}