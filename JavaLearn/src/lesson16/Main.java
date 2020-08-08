package lesson16;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<String, Integer>();
     //ペアで値を格納
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 182);
    for (String key : prefs.keySet()) { //県名一覧を取得し繰り返す
      int value = prefs.get(key); //県名(キー)を指定し人口(値)を取得
      System.out.println(key + "の人口は、" + value);
    }
  }
}