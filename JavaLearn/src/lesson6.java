public class lesson6 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    //  ↑ CalcLogicのtasu()やhiku()のように明示的に所属を示す必要がある
    System.out.println("足すと" + total +"、 引くと" + delta);
  }
}