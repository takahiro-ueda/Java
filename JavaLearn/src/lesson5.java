public class lesson5 {
  /*
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello();  //helloメソッドを呼び出す
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello() {
    System.out.println("湊さん、こんにちは！！！！");
  }
  */
  public static void methodA() {
    System.out.println("methodA");
    methodB();  //methodB メソッドの呼び出し
  }
  public static void methodB() {
    System.out.println("methodB");
  }
  public static void main(String[] args) {
    methodA();  //methodA メソッドの呼び出し
  }
}