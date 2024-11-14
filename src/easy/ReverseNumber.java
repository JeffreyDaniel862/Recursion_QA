package easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1324;
        System.out.println(reverseReturn(num));
        reverse(num);
    }
    static void reverse(int num) {
        if (num < 1) return;
        System.out.print(num%10 + "");
        reverse(num/10);
    }
    static int reverseReturn (int num) {
        return reverseReturn(num, 0);
    }
    private static int reverseReturn(int num, int result) {
        if (num % 10 == num) return result + num;
        result = (result + (num % 10)) * 10;
        return reverseReturn(num/10, result);
    }
}
