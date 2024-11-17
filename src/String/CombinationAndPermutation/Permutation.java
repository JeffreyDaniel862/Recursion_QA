package String.CombinationAndPermutation;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
    }
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
}
