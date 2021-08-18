// Consoleクラスを使用する宣言(コンソールからの入力を受け取る方法)
import java.io.Console;
public class EvenOdd {
  public static void main(String[] args) {
    try {
      // コンソールを取得
      Console console = System.console();
      // コンソールからの入力を受け取る
      String input = console.readLine("数字を入力してください: ");
      // inputの値(String)をint型に変換する
      int number = Integer.parseInt(input);
      if(number % 2 == 0) {
          System.out.println(number + "　は偶数です" );
      } else {
          System.out.println(number + "　は奇数です" );
      }  
    } catch(NumberFormatException e) {
        System.err.println("整数を入力してください!");
    }
  }
}
