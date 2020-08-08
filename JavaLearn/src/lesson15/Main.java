package lesson15;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    //6つのint値からDateインスタンスを作成
    c.set(2020,8,8,1,23,45);
    c.set(Calendar.MONTH, 9); //月を9(10月)に変更
    Date d = c.getTime();
    System.out.println(d);
    //Dateインスタンスからint値を作成
    Date now = new Date();  //現在の日時を習得
    c.setTime(now);
    int y = c.get(Calendar.YEAR); //年を取り出す
    System.out.println("今年は" + y + "年です！！");

    // 処理時間を計測
    // long start = System.currentTimeMillis();
    // //ここで何らかの時間がかかる処理
    // long end = System.currentTimeMillis();
    // System.out.println("処理にかかった時間は・・・・" + (end - start) + "ミリ秒でした");

    // String s = "abc,def:ghi";
    // String[] words = s.split("[,:]"); //正規表記パターン
    // for (String w : words) {
    //   System.out.println(w + "->");
    // }

    // String s = "abc,def:ghi";
    // String w = s.replaceAll("[beh]","X");
    // System.out.println(w);  // aXc,dXf:gXi

    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 10000; i++) {
    //   sb.append("Java");  //①バッファにJavaを追加
    // }
    // String s = sb.toString(); //②完成した連結済み文字列を取り出す

    // String s1 = "Java programming";
    // System.out.println("文字列s1の4文字目以降は" + s1.substring(3));  // => a programming
    // System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8)); // => a pro

    // String s1 = "Java and JavaScript";
    // if (s1.contains("Java")) {
    //   System.out.println("文字列s1は、Javaを含んでいます");
    // }
    // if (s1.endsWith("Java")) {
    //   System.out.println("文字列s1は、Javaが末尾にあります");
    // }
    // System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    // System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

    // String s2 = "Java";
    // String s3 = "Java";
    // if (s2.equals(s3)) {
    //   System.out.println("s2とs3は等しい");
    // }
    // if (s2.equalsIgnoreCase(s3)) {
    //   System.out.println("s2とs3はケースを区別しなければ等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");  //全角文字も半角文字もz1文字としてカウント
    // if (s1.isEmpty()) { //isEmptyはlength()==0より直感的に意味を捉えやすい
    //   System.out.println("s1は空文字です！");
    // }
  }
}