package lesson15;

public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    // String s2 = "Java";
    // String s3 = "Java";
    // if (s2.equals(s3)) {
    //   System.out.println("s2とs3は等しい");
    // }
    // if (s2.equalsIgnoreCase(s3)) {
    //   System.out.println("s2とs3はケースを区別しなければ等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");  //全角文字も半角文字もz1文字としてカウント
    // if (s1.isEmpty()) { //isEmptyはlength()==0より直感的に意味を捉えやすい
    //   System.out.println("s1は空文字です！");
    // }
  }
}