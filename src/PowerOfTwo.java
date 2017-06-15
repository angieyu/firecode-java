/**
 * Created by angie on 6/14/17.
 */
public class PowerOfTwo {

    public static boolean isPowOfTwo(int num) {
        if (((num & (num - 1)) == 0) || (num == 0)) return true;
        else return false;
    }

    public static void main(String[] args) {
    }
}
