package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (IOException e) { 
      System.out.println("エラーです！！"); //例外的状況になったときに備えて記述された代替処理
    }
    fw.close(); //try-catchの後でcloseする
  }
}