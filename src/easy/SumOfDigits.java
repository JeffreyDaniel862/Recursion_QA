package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1324;
        System.out.println(digitsSum(num));
    }
    static int digitsSum (int num) {
        if (num == 0) return 0;
        return num%10 + digitsSum(num/10);
    }
}
