import java.util.*;
class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = f(n);
        System.out.println(r);
    }

    static int f(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else {
            return f(n - 1)+f(n - 2);
        }
    }
}