public class lesson5 {
  //int型配列を受け取り、すべての要素を表示するメソッド
  public static void printArray(int[] array) {  //int[]は引数に配列型を渡す
    for (int element : array) {
      System.out.println(element);
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    printArray(array);  //配列を渡す
  }
  //printArrayメソッドに引数として渡しているのは、「配列まるごと」ではなくアドレス情報のみであることに注意
}