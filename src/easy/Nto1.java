package easy;

public class Nto1 {
    public static void main(String[] args) {
        printBoth(5);
    }
    static void print(int num) {
        if (num < 1) return;
        System.out.print(num + " ");
        print(num - 1);
    }
    static void printReverse(int num) {
        if (num < 1) return;
        printReverse(num - 1);
        System.out.print(num + " ");
    }
    static void printBoth(int num) {
        if (num < 1) return;
        System.out.print(num + " ");
        printBoth(num - 1);
        System.out.print(num + " ");
    }
}
