import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by angie on 6/10/17.
 */
public class UniqueCharsInAString {
    public static boolean areAllCharactersUnique(String str) {
        // create a cache to store and count all instances of a character
        // increment the value in the cache if we see it again, return out of the function right away and return false
        if (str == null || str.length() == 0) return true;
        HashMap<Character, Integer> myCache = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (myCache.containsKey(str.charAt(i))) return false;
            else myCache.put(str.charAt(i), 1);
        }
        return true;
    }

    public static void main(String[] args) {
        out.println(areAllCharactersUnique("abca"));
    }
}
