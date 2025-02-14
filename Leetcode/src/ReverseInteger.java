/**
 * (7) Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [-2^31, 2^31-1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer
 * overflows.
 *
 * Time complexity: O(1)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class ReverseInteger {
    public int reverse(int x){
        int result = 0;
        while(x != 0){
            // result * 10 + result % 10 --> x + 10 + y = new x (new reverse)
            int newResult = result * 10 + x % 10;
            if((newResult - x % 10) / 10 != result) return 0;   // check whether overflow
            result = newResult;
            x /= 10;
        }
         return result;
    }
}
