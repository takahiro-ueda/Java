package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
      fw.close();
    } catch (IOException e) { //Exceptionの子孫をどれでもキャッチ
      System.out.println("何らかの例外が発生しました"); //例外的状況になったときに備えて記述された代替処理
    }
  }
}