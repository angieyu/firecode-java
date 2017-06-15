import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class FindFirstNonDuplicateCharacterInAString {
    // if character exists in cache, increment the value
    // else add the character to the cache
    // no unique string found, return null
    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> myCache = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (myCache.containsKey(str.charAt(i))) myCache.put(str.charAt(i), myCache.get(str.charAt(i)) + 1);
            else myCache.put(str.charAt(i), 1);
        }
        for (char c : myCache.keySet()) {
            if (myCache.get(c) == 1) return c;
        }
        return null;
    }

    public static void main(String[] args) {
        out.println(firstNonRepeatedCharacter("bcdcd"));
    }
}
