/**
 * (70) Climbing Stairs
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be positive integer.
 *
 * Example 1:
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top
 * 1. 1 step + 1 step + 1 step
 * 2. 2 step + 1 step
 * 3. 1 step + 2 step
 *
 * Algorithm: Dynamic Programming
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class ClimbingStairs {
    public int climbStairs(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        int previous = 1;   // f[0] if using index to search, the first array number is 1
        int current = 2;    // f[1]
        // starts the third number
        for(int i = 3; i <= n; i++){
            current = current + previous;   // the newest current: current = old current value, previous = old previous value
            // get previous number
            previous = current - previous;  // the newest previous: current(updated current) - old previous
        }
        return current;
    }
}
