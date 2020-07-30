public class lesson6 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.println("足すと" + total +"、 引くと" + delta);
  }
  //このままでは[tasu()やhiku()メソッドがないので呼び出すことができない]
  //lesson6.javaにはtasu()やhiku()は存在しない
}