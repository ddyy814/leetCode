/**
 * (69) Sqrt(x)
 *
 * Implement int sqrt(int x)
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result of returned
 *
 * Example 1:
 * Input: 4
 * Output: 2
 *
 * Example 2:
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..... , and since the decimal digits part is truncated, return 2
 *
 * Time complexity:
 * Space complexity:
 *
 *
 * Easy level
 *
 */
public class Sqrt_x 
    public int mySqrt(int x){
        long low = 0;
        long high = x;
        if(x == 1) return 1;
        while(low != high){
            long y = (low + high) / 2;
            if(y * y == x){
                return (int) y;
            }
            if(y * y < x){
                low = y;
            }
            if(y * y > x){
                high = y;
            }
            if(low == high - 1){
                return (int)low;
            }
        }
        return (int)low;
    }
}
