package lesson16;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>(); //Integer型でArrayListを宣言
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {  //拡張for文(4.4.5項)も利用可能
      System.out.println(i);
    }
  }
}