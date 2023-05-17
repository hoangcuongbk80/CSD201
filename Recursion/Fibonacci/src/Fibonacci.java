public class Fibonacci {
    // Fibonacci using recursion
    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n; // Base cases: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2); // Recursive calls
        }
    }

    // Fibonacci using iteration
    public static int fibonacciIteration(int n) {
        if (n <= 1) {
            return n; // Base cases: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        }

        int prev = 0;
        int current = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev + current;
            prev = current;
            current = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 40; // Fibonacci number to calculate
        long startTime, endTime, duration;

        // Fibonacci using recursion
        startTime = System.nanoTime();
        int resultRecursion = fibonacciRecursion(n);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Fibonacci using recursion:");
        System.out.println("Result: " + resultRecursion);
        System.out.println("Time taken: " + duration + " nanoseconds");

        System.out.println();

        // Fibonacci using iteration
        startTime = System.nanoTime();
        int resultIteration = fibonacciIteration(n);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Fibonacci using iteration:");
        System.out.println("Result: " + resultIteration);
        System.out.println("Time taken: " + duration + " nanoseconds");
    }
}
