/**
 * (53) Maximum SubArray
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
 * sum and return its sum
 * 查找出一个子数组（至少有一个数字），子数组的合是最大的，然后返回
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6
 *
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which
 * is more subtle.
 *
 * Algorithm: Dynamic Programming
 *
 * Time complexity: O(n)
 * Space complexity:
 *
 * Easy level
 *
 *
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums){

        // initial maxToCurr and sum, and the value is the first value of array
        int maxToCurr = nums[0];
        int sum = nums[0];

        // starts the second value to iteration
        for(int i = 1; i < nums.length; i++){
            //之前的maxToCurr + 当前的number， 和当前的number比较，然后取最大的值
            maxToCurr = Math.max(maxToCurr + nums[i], nums[i]);
            // 之前的sum， 和当前的maxToCurr之间取最大的值
            sum = Math.max(sum, maxToCurr);
        }
        return sum; // return sum
    }
}
