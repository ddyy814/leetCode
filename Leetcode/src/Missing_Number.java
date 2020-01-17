/**
 * (268) Missing Number
 * Given an array containing n distinct numbers taken from 0,1,2, ..... , n, find the one that is missing from the array.
 *
 *
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 * Input: [9,y6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 *
 */
public class Missing_Number {
    public int missingNumber(int[] nums){
       int sum = 0;
       for(int num : nums){
           sum = sum + num;
       }
       return (nums.length * (nums.length + 1) / 2) - sum;      // 求和公式
    }
}
