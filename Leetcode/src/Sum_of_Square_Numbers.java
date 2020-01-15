/**
 * (633) Sum of Square Numbers
 *
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that
 * a^2 + b^2 = c.
 *
 * Example 1:
 * Input: 5
 * Output: true
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * Example 2:
 * Input: 3
 * Output: false
 *
 * Time complexity: O(c^1/2)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Sum_of_Square_Numbers {
    public boolean judgeSquareSum(int c){
        int m = (int)Math.sqrt(c);
        for(int i = 0; i <= m; ++i){
            int n = (int)Math.sqrt(c - i * i);
            if(i * i + n * n == c) return true;
        }
        return false;
    }
}
