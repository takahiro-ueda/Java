package lesson16;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();
    //赤・青・黄の順に格納
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    for(String s : colors) {
      System.out.println(s + "→");
    }
  }
}