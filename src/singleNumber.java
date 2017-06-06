import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by angie on 6/5/17.
 */
public class singleNumber {
    public static int singleNumber(int[] A) {
        // instantiate a cache, add all elements of array to cache
        // if you encounter the same element, increment the value of the HashMap
        // else, add the element as a key to the HashMap
        HashMap<Integer, Integer> myCache = new HashMap<Integer, Integer>();
        for (int n : A) {
            if (myCache.containsKey(n) == true) {
                myCache.put(n, myCache.get(n) + 1);
            } else {
                myCache.put(n, 1);
            }
        }
        return (int) getKeyFromValue(myCache, 1);
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
        int[] testArr = {1, 2, 3, 4, 1, 2, 4, 3, 5};
        out.println(singleNumber(testArr));
    }
}
