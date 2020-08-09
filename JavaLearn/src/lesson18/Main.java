package lesson18;
import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Class.forName("org.h2.Driver");
    String dburl = "jdbc:h2:~/test";  //接続先DBを指定
    String sql = "INSERT INTO EMPLOYESS(name) VALUES('aoki')";
    Connection conn = DriverManager.getConnection(dburl); //DBに接続
    conn.createStatement().executeUpdate(sql);  //sqlを送信
    conn.close(); //db接続を閉じる
  }
}