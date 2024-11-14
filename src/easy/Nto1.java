package easy;

public class Nto1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int num) {
        if (num < 1) return;
        System.out.print(num + " ");
        print(num - 1);
    }
}
