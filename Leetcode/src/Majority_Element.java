/**
 * (169) Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than [n/2]
 * times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Algorithm: Divide and Conquer
 *
 * Easy level
 */
public class Majority_Element {
    public int majorityElement(int[] nums){
      //  if(nums == null || nums.length == 0) return Integer.MIN_VALUE;

        int result = nums[0]; // first value of array
        int count = 1;  // combine two value if same

        // loop rest of values
        for(int i = 1; i < nums.length; i++){
            // if the nums[i]  = result ,count ++
            if(nums[i] == result) count++;
            else if(count == 0){
                result = nums[i];
                count++;
            }else{
                count--;    // 抵消 result does not changed ,but count--
            }
        }
        return result;
    }
}
