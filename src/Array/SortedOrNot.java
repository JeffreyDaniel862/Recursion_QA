package Array;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,10,7,8,9};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted (int[] arr) {
        return isSorted(arr, 0);
    }
    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 2) return arr[index] < arr[index + 1];
        return (arr[index] < arr[index + 1]) && isSorted(arr, index + 1);
    }
}
