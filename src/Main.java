public class Main {
    public static void main(String[] args) {
        print(5);
    }
    static void print (int num) {
        if (num < 1) return;
        print(num - 1);
        System.out.println(num);
    }
}