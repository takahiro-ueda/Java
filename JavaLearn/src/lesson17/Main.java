package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // FileWriter fw = null;
    FileWriter fw;  //mainメソッドブロック(5~13行目)はfwのスコープのまま
    try {
      fw = new FileWriter("data.txt");  //tryブロック内でコンストラクタが動作する
      fw.write("hello!"); //スコープ内だからfwを利用可能！
    } catch (IOException e) { 
      System.out.println("何らかの例外が発生しました"); //例外的状況になったときに備えて記述された代替処理
    } finally {
      fw.close(); //スコープ内だからfwを利用可能！
    }
  }
}