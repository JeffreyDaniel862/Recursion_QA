package String;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "jeffrey";
        String result = remove(str);
        System.out.println(result);
    }
    private static String remove(String str) {
        if (str.isEmpty()) return "";
        if (str.charAt(0) == 'f') return remove(str.substring(1));
        return str.charAt(0) + remove(str.substring(1));
    }
}
