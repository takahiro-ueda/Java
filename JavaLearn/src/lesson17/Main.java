package lesson17;
// import java.io.*;
import java.io.IOException;//練習問題17-4

public class Main {
  // public static void main(String[] args) {
  //   // Person p = new Person();
  //   // p.setAge(-128); //誤った値のセットを試みる→例外発生
  //   try {
  //     //試験的に例外を発生させる
  //     throw new UnsupportedMusicFileException("未対応のファイルです！！！");
  //   } catch (Exception e) {
  //     e.printStackTrace();
  //   }
  // }

  //練習問題17-1
  // public static void main(String[] args) {
  //   String s = null;
  //   System.out.println(s.length());
  // }

  //練習問題17-2
  // try {
  //   String s = null;
  //   System.out.println(s.length());
  // } catch (NullPointerException e) {
  //   System.out.println("NullPointerException例外をcatchしました！");
  //   System.out.println("--スタッフトレース(ここから)--");
  //   e.printStackTrace();
  //   System.out.println("--スタッフトレース(ここまで)--");
  // }

  //練習問題17-3
  // try {
  //   int i = Integer.parseInt("三");
  // } catch (NumberFormatException e) { //APIリファレンスで調べた送出される例外
  //   System.out.println("NumberFormatException例外をcatchしました。");
  // }

  //練習問題17-4
  public static void main(String[] args) throws IOException {
    System.out.println("プログラムが起動しました！");
    throw new IOException();
  }
}