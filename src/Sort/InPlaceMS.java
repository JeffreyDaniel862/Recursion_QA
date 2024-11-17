package Sort;

import java.util.Arrays;

public class InPlaceMS {
    public static void main(String[] args) {
        int[] arr = {2,45,7,56,1,90,56,34};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort (int[] arr, int start, int end) {
        if (end - start == 1) return;
        
        int mid = start + (end - start) / 2;
        
        sort(arr, start, mid);
        sort(arr, mid, end);
        
        merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] result = new int[end - start];
        
        int i = start;
        int j = mid;
        int k = 0;
        
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                result[k] = arr[i];
                i++;
            } else {
                result [k] = arr[j];
                j++;
            }
            k++;
        }
        
        while (i < mid) {
            result[k] = arr[i];
            k++;
            i++;
        }

        while (j < end) {
            result[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < result.length; l++) {
            arr[start + l] = result[l];
        }
    }
}
