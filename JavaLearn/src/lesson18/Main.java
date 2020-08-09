package lesson18;
import java.io.InputStream;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws Exception {
    URL u = new URL("https://book.impress.co.jp/");
    InputStream is = u.openStream();  //インターネットへ接続
    int i = is.read();
    while (i != -1) { //ページの終わりまで繰り返す
      char c = (char)i;
      System.out.print(c);  //読んだ内容を画面に表示
      i = is.read();
    }
  }
}