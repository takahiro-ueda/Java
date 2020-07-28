import javax.sound.midi.Sequence;

public class lesson4 {
  public static void main(String[] args) {
    int[][] scores = {{40, 50, 60}, {80, 60, 80}};  //このような初期化が可能
    System.out.println(scores.length);  //2が出力される
    System.out.println(scores[0].length); //3が出力される
  }
}