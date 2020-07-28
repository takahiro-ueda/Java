import javax.sound.midi.Sequence;

public class lesson4 {
  public static void main(String[] args) {
    int [] arrayA = {1, 2, 3};  //arrayA[0]は1
    int [] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;  //arrayB[0]に100を代入
    System.out.println(arrayA[0]);  //arrayA[0]を表示すると・・・
  }
}