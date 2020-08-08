package lesson15;

public class Player {
  public boolean isValidPlayerName(String name) {
    if (name.length() != 8) { //文字数が8文字であること
      return false;
    }
    char first = name.charAt(0);
    if (!(first >= 'A' && first <= 'Z')) {  //最初の1文字はA~Z
      return false;
    }
    for (int i =1; i < 8; i++) {
      char c = name.charAt(i);
      if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {  //以降の文字はA~Zか0~9
        return false;
      }
    }
  }
  return true;
}