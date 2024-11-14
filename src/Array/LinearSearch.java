package Array;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,34,56,76,32,2,4,6,8,90};
        int[] arrWithMultiple = new int[] {1,2,3,4,5,6,4,4,8};
        int target = 4;
        System.out.println(findIndex(arr, target, 0));
        System.out.println(isPresent(arr, target, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arrWithMultiple, target, 0, list));
        System.out.println(findAllIndex(arrWithMultiple, target, 0));
    }

    // return index if present else return -1
    private static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return findIndex(arr, target, index + 1);
    }

    // return true if present or false otherwise
    private static boolean isPresent (int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return arr[index] == target || isPresent(arr, target, index + 1);
    }

    // METHOD OVERRIDING:

    // return arraylist with indexes of target (multiple occurrence of elements in array) without passing arraylist as parameter
    private static ArrayList<Integer> findAllIndex (int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        return findAllIndex(arr, target, index, list);
    }

    // return arraylist with indexes of target (multiple occurrence of elements in array) pass arraylist as parameter
    private static ArrayList<Integer> findAllIndex (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (arr.length == index) return list;
        if (arr[index] == target) list.add(index);
        return findAllIndex(arr, target, index + 1, list);
    }
}
