public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,5,6,7,8,9,12,14,20};
        int target = 7;
        System.out.println(bS(arr, target, 0, arr.length));
    }
    static int bS (int[] arr, int target, int start, int end) {

        if (end < start) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return bS(arr, target, mid + 1, end);
        }
        return bS(arr, target, start, mid - 1);
    }
}
