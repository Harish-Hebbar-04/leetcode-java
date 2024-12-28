public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed string: " + reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
