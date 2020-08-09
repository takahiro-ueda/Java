package lesson17;
// import java.io.*;

public class Main {
  public static void main(String[] args) {
    // Person p = new Person();
    // p.setAge(-128); //誤った値のセットを試みる→例外発生
    try {
      //試験的に例外を発生させる
      throw new UnsupportedMusicFileException("未対応のファイルです！！！");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}