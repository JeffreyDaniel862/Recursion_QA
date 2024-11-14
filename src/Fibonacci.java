public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(8)); // to find the nth fibonacci number

        // to print the fibonacci sequence till the nth number
        for (int i = 0; i <= 8; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib (int num) {
        if (num < 2) return num;
        return fib(num - 2) + fib(num - 1);
    }
}
