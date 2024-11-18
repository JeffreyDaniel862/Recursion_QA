// AMAZON QUESTION

package String.CombinationAndPermutation;

import java.util.ArrayList;

public class DiceRolls {
    public static void main(String[] args) {
        diceCombination("", 4);
        System.out.println();
        System.out.println(diceCombinationReturn("", 4));
    }
    private static void diceCombination (String processed, int target) {
        if (target == 0) {
            System.out.print(processed + ", ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombination(processed + i, target - i);
        }
    }

    private static ArrayList<String> diceCombinationReturn (String processed, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(diceCombinationReturn(processed + i, target - i));
        }
        return result;
    }
    private static void customDiceFaceCombination (String processed, int target, int face) {
        if (target == 0) {
            System.out.print(processed + ", ");
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            customDiceFaceCombination(processed + i, target - i, face);
        }
    }
}