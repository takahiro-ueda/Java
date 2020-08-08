package lesson16;
import java.util.Set;
import java.util. TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>();
    //赤・青・黄の順に格納
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for(String s : words) {
      System.out.println(s + "→");
    }
  }
}