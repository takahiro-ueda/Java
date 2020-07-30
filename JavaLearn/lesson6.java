package calcapp.main;


public class lesson6 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    //  ↑ CalcLogicのtasu()やhiku()のように明示的に所属を示す必要がある
    System.out.println("足すと" + total +"、 引くと" + delta);
  }
}