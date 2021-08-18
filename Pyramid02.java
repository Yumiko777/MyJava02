import java.util.Scanner;
public class Pyramid02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int count = scanner.nextInt();
        for (int i = 0; i <= count * 2; i++ ) {
            if (i < count - i || i > count + i) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
