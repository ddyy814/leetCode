import java.util.ArrayList;
import java.util.List;

/**
 * (728) Self Dividing Numbers
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0;
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if
 * possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [ 1,2,3,4,5,6,7,8,9,11,12,15,22]
 *
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Self_Dividing_Numbers {
    public Lsit<Integer> selfDividingNumber(int left, int right){
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++)
            if(dividingNumber(i)) result.add(i);
            return result;
    }
    boolean dividingNumber(int num){
        for(int n = num; n > 0; n /= 10){
            if(n % 10 == 0 || num % (n % 10) != 0)
                return false;
        }
        return true;
    }
}
