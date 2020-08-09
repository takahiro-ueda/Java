package lesson17;

public class UnsupportedMusicFileException extends Exception {  //テェック例外にする
  //エラーメッセージを受け取るコンストラクタ
  public UnsupportedMusicFileException(String msg) {
    super(msg);
  }
}