package lesson18;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // FileReader fr = new FileReader("data.txt"); //ファイルを開く
    FileWriter fw = new FileWriter("data.txt"); //ファイルを開く
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    fw.close(); //ファイルを閉じる
  }
}