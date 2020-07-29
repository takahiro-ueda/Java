public class lesson5 {
  //1つ目のaddメソッド
  public static int add(int x, int y) { //1つ目のaddメソッド
    return x + y;
  }
  //2つ目のaddメソッド
  public static int add(int x, int y, int z) {  //2つ目のaddメソッド
    return x + y + z;
  }
  public static void main(String[] args) {
    System.out.println("10+20= " + add(10, 20)); //1つ目のaddメソッドが呼び出される
    System.out.println("10+20+30= " + add(10, 20, 30));  //2つ目のaddメソッドが呼び出される
  }
  //仮引数の型だけでなく、個数が違う場合もオーバーロードできます
}