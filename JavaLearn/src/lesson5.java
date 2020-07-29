public class lesson5 {
  //int型配列を受け取り、配列内の要素全てに１を加えるメソッド
  public static void incArray(int[] args) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  //↑結果をreturnで返していないためエラー
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);  //メソッド実行
    for (int i : array) {
      System.out.println(i);  //arrayの全要素を出力
    }
  }
}