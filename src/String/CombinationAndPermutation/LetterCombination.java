package String.CombinationAndPermutation;

// Letter Combination Of Phone Number
// GOOGLE QUESTION


import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        findPermutation("", "12");
        System.out.println();
        System.out.println(returnPermutation("", "72"));
    }
    private static void findPermutation(String processed, String str) {
        if (str.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }
        int digit = str.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            findPermutation(processed + (char) ('a' + i), str.substring(1));
        }
    }

    private static ArrayList<String> returnPermutation(String processed, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = str.charAt(0) - '0'; // find range using this digit
        if (digit == 1) return returnPermutation(processed, str.substring(1)); // because 1 doesn't have any alphabets in it in number pad.
        ArrayList<String> result = new ArrayList<>(); // result list created to store the answers up to this level (Local answer)

        int startRange = (digit == 8 || digit == 9) ? (digit - 2) * 3 + 1 : (digit - 2) * 3; // start range for 8 & 9 differs

        int endRange = (digit - 1) * 3; // end range for all numbers except 7 and 9
        if (digit == 7 || digit == 8) endRange = (digit - 1) * 3 + 1; // end range for 7
        else if (digit == 9) endRange = (digit - 1) * 3 + 2; // end range for 9


        for (int i = startRange; i < endRange; i++) {
            // adding all the values from below recursive calls to result list
            result.addAll(returnPermutation(processed + (char) ('a' + i), str.substring(1)));
        }
        return result; // returning result list to above levels.
    }
}
