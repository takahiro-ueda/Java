public class lesson5 {
  //int型配列を受け取り、配列内の要素全てに１を加えるメソッド
  // public static void incArray(int[] args) {
  //   for (int i = 0; i < array.length; i++) {
  //     array[i]++;
  //   }
  // }
  // //↑結果をreturnで返していないためエラー
  // public static void main(String[] args) {
  //   int[] array = {1, 2, 3};
  //   incArray(array);  //メソッド実行
  //   for (int i : array) {
  //     System.out.println(i);  //arrayの全要素を出力
  //   }
  // }

  //            ↓　変更

  public static int[] makeArray(int size) { //int型配列を作成して戻すメソッド
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;  //配列を戻す
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);  //arrayの全要素を出力
    }
  }
}