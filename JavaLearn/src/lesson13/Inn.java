package lesson13;

public class Inn {
  public void checkIn(Hero h) {
    h.hp = -100;  //ここが不具合の原因！
  }
}