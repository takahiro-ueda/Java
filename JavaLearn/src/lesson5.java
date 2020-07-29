public class lesson5 {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    hello("植田");  //"植田"を渡してhelloメソッドを呼び出す
    hello("朝香");  //"朝香"を渡してhelloメソッドを呼び出す
    hello("菅原");  //"菅原"を渡してhelloメソッドを呼び出す
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
}