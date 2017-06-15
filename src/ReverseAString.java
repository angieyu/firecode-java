import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class ReverseAString {
    public static String reverseString(String str) {
        // edge case
        if (str == null) return null;
        String inputString = str;
        String outputString;

        StringBuilder sb = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            sb.append(inputString.charAt(i));
        }
        outputString = sb.toString();
        return outputString;
    }

    public static void main(String[] args) {
        reverseString("abc");
    }
}
