import static java.lang.System.out;

/**
 * Created by angie on 6/6/17.
 */
public class FibonacciNumber {
    public static int fib(int n) {
        // base case
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        out.println(fib(10));
    }
}
