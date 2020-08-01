// package calcapp.main;
// import calcapp.logics.*;

// public class lesson6 {
//   public static void main(String[] args) {
//     int a = 10; int b = 2;
//     int total = CalcLogic.tasu(a, b); //FQCNでなくてもエラーにならない
//     int delta = calcapp.logics.CalcLogic.hiku(a, b);  //FQCNを指定してもよい
//     System.out.println("足すと" + total +"、 引くと" + delta);
//   }
// }
public class lesson6 {
  public static void main(String[] args) {
    int[] heights = {172, 149, 152, 191, 155};
    java.util.Arrays.sort(heights); //Javaが備える並べ替え命令
    for (int h : heights) {
      System.out.println(h);
    }
  }
}