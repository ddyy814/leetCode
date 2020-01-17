/**
 * (674) Longest Continuous Increasing Subsequence
 *
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence(subarray).
 *
 * Example 1:
 * Input: [1,3,5,4,7]
 * Output: 3
 * Explanation:
 * The longest continuous increasing subsequence is [1,3,5], its length is 3. Even though [1,3,5,7] is also an increasing
 * subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 *
 * Example 2:
 * Input: [2,2,2,2,2]
 * Output: 1
 * Explanation: The longest continuous increasing subsequence is [2], its length is 1.
 *
 * Note: Length of the array will not exceed 10000.
 *
 *
 * Time complexity: O(n)
 * Space complexity: O(n) -> O(1)
 *
 * Easy level
 */
public class Longest_Continuous_Increasing_Subsequence {
    public int findLengthOfLCIS(int[] nums){
        if(nums.length == 0) return 0;
        //初始化为1，就算最次数组里也会有一个数字，所以为1
        int current = 1;
        int result = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){      // 如果当前数比之前数大
                current++;
                result = Math.max(result, current); //更新result
            }else{
                current = 1;    // if nums[i] <= nums[i - 1], 重制 current = 1
            }
        }
        return result;
    }
}
