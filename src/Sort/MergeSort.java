package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20,9,87,56,34,19,6,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    private static int[] sort (int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge (int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        // comparing the elements in both array and add in result array in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        // if any one of the array is complete

        // if right array elements are added in result and left is left add all the left elements in result
        while (i < left.length) {
            result[k] = left[i];
            k++;
            i++;
        }

        // if left array elements are added in result and right has some to add, add it to the result array.
        while (j < right.length) {
            result[k] = right[j];
            k++;
            j++;
        }

        return result;
    }
}
