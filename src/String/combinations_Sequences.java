package String;

import java.util.ArrayList;

public class combinations_Sequences {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(returnCombination("", str));
        System.out.println(returnAsciiCombination("", str));
        combination("",str);
        System.out.println();
        asciiCombination("", str);
        System.out.println();
        ArrayList<ArrayList<Integer>> list = iterationSubset(new int[]{1,2,3});
        for (ArrayList<Integer> internal : list) {
            System.out.print(internal + " ");
        }
    }

    // Just print combination doesn't return anything.
    private static void combination (String processed, String str) {
        if (str.isEmpty()) {
            if (!processed.isEmpty()) System.out.print(processed + ", ");
            return;
        };
        combination(processed + str.charAt(0), str.substring(1));
        combination(processed, str.substring(1));
    }

    // Return ArrayList of String and Arraylist is not passed as a parameter. ArrayList is created inside the function body.
    private static ArrayList<String> returnCombination (String processed, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()) list.add(processed);
            return list;
        }

        ArrayList<String> left = returnCombination(processed + str.charAt(0), str.substring(1));
        ArrayList<String> right = returnCombination(processed, str.substring(1));

        left.addAll(right);
        return left;
    }

    // Just print combination doesn't return anything.
    private static void asciiCombination (String processed, String str) {
        if (str.isEmpty()) {
            if (!processed.isEmpty()) System.out.print(ascii(processed) + ", ");
            return;
        };
        asciiCombination(processed + str.charAt(0), str.substring(1));
        asciiCombination(processed, str.substring(1));
    }

    // Return arraylist of ascii value in string.
    private static ArrayList<String> returnAsciiCombination (String processed, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()) list.add(ascii(processed));
            return list;
        }

        ArrayList<String> left = returnAsciiCombination(processed + str.charAt(0), str.substring(1));
        ArrayList<String> right = returnAsciiCombination(processed, str.substring(1));

        left.addAll(right);
        return left;
    }

    // convert char and string in ascii
    private static String ascii (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int ascii = (int) character;
            result.append(ascii);
        }
        return result.toString();
    }

    // same above problem using iteration in Integer array (Just like String)
    private static ArrayList<ArrayList<Integer>> iterationSubset (int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : arr) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> inter = new ArrayList<>(result.get(i));
                inter.add(num);
                result.add(inter);
            }
        }

        return result;
    }
}
