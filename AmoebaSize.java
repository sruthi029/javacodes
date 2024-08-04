import java.util.Scanner;

public class AmoebaSize {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 3; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        int amoebaSize = fibonacci(month);
        System.out.println(amoebaSize);
    }
}
