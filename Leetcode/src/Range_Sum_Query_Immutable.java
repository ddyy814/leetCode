/**
 * (303) Range Sum Query - Immutable
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i <= j) inclusive.
 *
 * Example:
 * Given nums = [-2,0,3,-5,2,-1]
 *
 * sumRange(0,2) -> 1
 * sumRange(2,5) -> -1
 * sumRange(0,5) -> -3
 *
 * Note:
 * 1. You may assume that the array does not change;
 * 2. There are many calls to sumRange function.
 *
 * Time complexity:
 * Space complexity:
 *
 *
 */
public class Range_Sum_Query_Immutable {
    int sums[];

    public NumArray(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i - 1] + nums[i];
        }
        sums = nums;
    }
    public int sumRange(int i, int j){
        if(i == 0) return sums[j];
        return sums[j] - sums[i - 1];
    }
}
