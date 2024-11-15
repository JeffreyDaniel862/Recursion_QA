package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubbleSort(arr, arr.length -1 , 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort (int[] arr, int row, int col) {
        if (row < 1) return;

        if (col < row) {
            if (arr[col] > arr[col + 1]) swap(arr, col, col + 1);
            bubbleSort(arr, row, col + 1);
        } else bubbleSort(arr, row - 1, 0);
    }
    private static void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
