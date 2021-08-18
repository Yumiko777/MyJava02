import java.util.Scanner;
class Add {
        public static void main(String args[]) {
                 Scanner scanner = new Scanner(System.in);
                 System.out.print("1つ目の数字を入力してください: ");
                 int num1 = scanner.nextInt();
                 System.out.print("2つ目の数字を入力してください: ");
                 int num2 = scanner.nextInt();
                 int sum = num1 + num2;
                 System.out.println(num1 + " + " + num2 + " = " + sum);
                 scanner.close();

        }

}