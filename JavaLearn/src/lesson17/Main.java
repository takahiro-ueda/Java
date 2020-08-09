package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // FileWriter fw = null;
    FileWriter fw = new FileWriter("data.txt"); //mainメソッドブロック(5~12行目)をfwのスコープにする
    try {
      fw.write("hello!"); //スコープ内だからfwを利用可能！
    } catch (IOException e) { 
      System.out.println("何らかのエラーが発生する"); //例外的状況になったときに備えて記述された代替処理
    } finally {
      fw.close(); //スコープ内だからfwを利用可能！
    }
  }
}