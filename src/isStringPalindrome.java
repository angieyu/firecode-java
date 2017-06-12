import static java.lang.System.out;

/**
 * Created by angie on 6/10/17.
 */
public class isStringPalindrome {
    public static boolean isStringPalindrome(String str) {
        // iterate through the str input with two pointer, one pointer starting from the front and one pointer starting from the back
        if (str == null) return true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        out.println(isStringPalindrome("mada"));
    }
}
