import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by angie on 6/14/17.
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String input1, String input2) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            if (hm1.containsKey(input1.charAt(i))) hm1.put(input1.charAt(i), hm1.get(input1.charAt(i)) + 1);
            else hm1.put(input1.charAt(i), 1);
        }
        for (int j = 0; j < input2.length(); j++) {
            if (hm2.containsKey(input2.charAt(j))) hm2.put(input2.charAt(j), hm2.get(input2.charAt(j)) + 1);
            else hm2.put(input2.charAt(j), 1);
        }
        Collection<Integer> arr1 = hm1.values();
        Collection<Integer> arr2 = hm2.values();
        boolean collectionsAreEqual = arr1.containsAll(arr2) && arr2.containsAll(arr1);
        out.println(collectionsAreEqual);
        return collectionsAreEqual;
    }

    public static void main(String[] args) {
        isIsomorphic("aab", "ced");
    }
}
