package String;

public class RemoveString {
    public static void main(String[] args) {
        String statement = "An apple a day keeps the doctor away.";
        System.out.println(skipAPart(statement));
    }
    private static String skip (String str) {
        if (str.isEmpty()) return "";

        if (str.startsWith("apple")) return skip(str.substring(5));
        return str.charAt(0) + skip(str.substring(1));
    }
    private static String skipAPart (String str) {
        if (str.isEmpty()) return "";

        if (str.startsWith("app") && !str.startsWith("apple")) return skipAPart(str.substring(3));
        return str.charAt(0) + skipAPart(str.substring(1));
    }
}
