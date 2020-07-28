import javax.sound.midi.Sequence;

public class lesson4 {
  public static void main(String[] args) {
    int [] seq = new int [10];

    //塩基配列をランダムに生成  
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java .util.Random().nextInt(4);
    }
    
    //生成した塩基配列の記号を表示
    for (int i = 0; i < seq.length; i++) {
      switch (seq[i]) {
        case 0:
          System.out.print("A ");
          break;
        case 1:
          System.out.print("T ");
          break;
        case 2:
          System.out.print("G ");
          break;
        case 3:
          System.out.print("C ");
          break;
      }
      //13~26行目のswitch文が長く、冗長です。
    }
  }
}