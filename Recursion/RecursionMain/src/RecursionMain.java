public class RecursionMain {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 5;

        // Calculate factorial
        int factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);

        // Calculate Fibonacci series
        System.out.println("Fibonacci Series up to " + number + " terms:");
        for (int i = 0; i < number; i++) {
            int fibonacciResult = fibonacci(i);
            System.out.print(fibonacciResult + " ");
        }
    }
}
