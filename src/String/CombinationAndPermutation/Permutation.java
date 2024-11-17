package String.CombinationAndPermutation;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
        System.out.println();
        System.out.println(permutationReturn("", str));
        System.out.println(countPermutation("", str));
    }

    // Just print all the permutation of given string
    private static void permutation(String processed,String str) {
        if (str.isEmpty()) {
            System.out.print(processed + ", ");
            return;
        }
        for (int i = 0; i < processed.length() + 1; i++) {
            String param = processed.substring(0,i) + str.charAt(0) + processed.substring(i);
            permutation(param, str.substring(1));
        }
    }

    // return all permutation of given string using arraylist
    private static ArrayList<String> permutationReturn (String processed, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> result = new ArrayList<>(); // list to store answers

        for (int i = 0; i < processed.length() + 1; i++) {
            String param = processed.substring(0,i) + str.charAt(0) + processed.substring(i);
            result.addAll(permutationReturn(param, str.substring(1))); // adding result from below recursive levels to result list.
        }
        return result; // returning list to above level
    }

    private static int countPermutation (String processed, String str) {
        if (str.isEmpty()) return 1;
        int count = 0;
        for (int i = 0; i < processed.length() + 1; i++) {
            String param = processed.substring(0,i) + str.charAt(0) + processed.substring(i);
            count += countPermutation(param, str.substring(1));
        }
        return count;
    }
}
