import javax.sound.midi.Sequence;

public class lesson4 {
  public static void main(String[] args) {
    int[][] scores = new int[2][3];
    scores[0][0] = 40;
    scores[0][1] = 50;
    scores[0][2] = 60;
    scores[1][0] = 80;
    scores[1][1] = 60;
    scores[1][2] = 70;
    System.out.println(scores[1][1]);
  }
}