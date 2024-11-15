package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,1,0};
        selectionSort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort (int[] arr, int row, int col, int max) {
        if (row < 1) return;

        if (col < row) {
            if (arr[col + 1] > arr[max]) max = col + 1;
            selectionSort(arr, row, col + 1, max);
        } else {
            if (max != row) swap(arr, max, row);
            selectionSort(arr, row - 1, 0, 0);
        }
    }
    private static void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
