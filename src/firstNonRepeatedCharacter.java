import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by angie on 6/7/17.
 */
public class firstNonRepeatedCharacter {
    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> cache = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            // if character exists in cache, increment the value
            // else add the character to the cache
            if (cache.containsKey(str.charAt(i))) {
                cache.put((str.charAt(i)), cache.get(str.charAt(i)) + 1);
            } else {
                cache.put(str.charAt(i), 1);
            }

        }
        Character chResult = (Character) getKeyFromValue(cache, 1);
        // no unique string found, return null
        return chResult;
    }

    public static Object getKeyFromValue(HashMap hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        out.println(firstNonRepeatedCharacter("bbcdcd"));
    }
}
