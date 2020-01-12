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
public class Sqrt_x {

    // solution 1
    public int mySqrt(int x){
        int curr = 0;      // current number of square
        int result = 0; // counting , and return value
        int add = 1;    // 差值 1，3，5，7，9，。。。。。

        while(curr <= x){
            // define whether or not overflow, 如果 curr + add结果大于 Integer.Max_value, return result就是结果了已经
            if(Integer.MAX_VALUE - curr < add) return result;
            curr += add;
            result++;
            add += 2;   // add and get the next value (差值)
        }
        return result - 1;  // return value = 前一个数
    }

    //solution 2
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
