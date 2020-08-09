package lesson18;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt"); //ファイルを開く
    int input = fr.read();
    while (input != -1) {
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close(); //ファイルを閉じる
  }
}