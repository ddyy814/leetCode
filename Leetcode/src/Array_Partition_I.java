import java.util.Arrays;

/**
 * (561) Array Partition I
 *
 * Given an array of 2n integers, your task is to group these integers into n paris integer, say(a1,b1),...(an,bn) which
 * makes sum of min(aj,bj)for all i from 1 to n as large as possible.
 *
 * Example 1:
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation:
 * n is 2, and the maximum sum of pairs is 4 = min(1,2) + min(3,4)
 *
 * Node:
 * 1. n is a positive integer, which is in the range of [1, 10000]
 * 2. All the integers in the array will be in the range of [-10000, 10000]
 *
 * Time complexity: O(nlogn)
 * Space complexity: O(1)
 *
 * Algorithm: Greedy
 *
 *
 *
 */
public class Array_Partition_I {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
}
