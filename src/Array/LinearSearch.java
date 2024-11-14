package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,34,56,76,32,2,4,6,8,90};
        int target = 76;
        System.out.println(findIndex(arr, target, 0));
        System.out.println(isPresent(arr, target, 0));
    }
    private static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return findIndex(arr, target, index + 1);
    }
    private static boolean isPresent (int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return arr[index] == target || isPresent(arr, target, index + 1);
    }
}
