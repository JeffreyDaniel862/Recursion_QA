package easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 1324;
        System.out.println(product(num));
    }
    static int product(int num) {
        if (num < 1) return 1;
        return num%10 * product(num/10);
    }
}
