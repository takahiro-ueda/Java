package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // FileWriter fw = null;
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (IOException e) { 
      System.out.println("何らかのエラーが発生する"); //例外的状況になったときに備えて記述された代替処理
    } finally {
      fw.close(); //この行でエラー
    }
  }
}