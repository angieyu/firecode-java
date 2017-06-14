import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class replace {
        public static String replace(String a, String b) {
        StringBuilder A = new StringBuilder(a);
        StringBuilder B = new StringBuilder(b);
        for (int i = 0; i < A.length(); i++) {
            int space = A.indexOf(" ");
            if (space > 0) {
                out.println(space);
                A.delete(space, space + 1);
                A.insert(space, B);
            }
        }
        return A.toString();
    }


    public static void main(String[] args) {
        out.println(replace("hi this is angela", "ABC"));
    }
}
