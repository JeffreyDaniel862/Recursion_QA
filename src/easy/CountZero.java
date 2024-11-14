package easy;

public class CountZero {
    public static void main(String[] args) {
        int num = 320404;
        System.out.println(count(num));
    }
    static int count (int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 10 != 0) return count(num/10);
        return 1 + count(num / 10);
    }
}
