import java.util.Scanner;

public class Combination_ncr {
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calculateCombination(int n, int r) {
        long numerator = calculateFactorial(n);
        long denominator = calculateFactorial(r) * calculateFactorial(n - r);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        long result = calculateCombination(n, r);
        System.out.println(result);
    }
}
