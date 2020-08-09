package lesson17;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = new FileWriter("date.txt");
    //FileWriterのコンストラクタはIOExceptionを発生させる可能性があるか、try-catch文を記述していない(失敗時にどうするか考えていない)
  }
}