package lesson15;

public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "Java";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");  //全角文字も半角文字もz1文字としてカウント
    if (s1.isEmpty()) { //isEmptyはlength()==0より直感的に意味を捉えやすい
      System.out.println("s1は空文字です！");
    }
  }
}