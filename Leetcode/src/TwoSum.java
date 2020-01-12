import java.util.HashMap;

/**
 *  (1) Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * 给定一个整数数组， 返回两个数字的索引，以便他们加起来成为一个指定的目标（数字）
 * 你可以假设每次输入都只有一个可以解决的方案，并且不可以使用同一个数字两次
 *
 *
 * Example: nums = [2,7,11,15] , target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 *
 * return [0,1].
 *
 * O(n) time complexity
 *
 * Easy level
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        // return result array within two values
        int[] result = new int[2];

        // using hashMap to store nums and index pair
        Map<Integer,Ingeter> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            /*
            check if the map has an element which is equal to the difference between the target
            and current element
             */
            Integer value = map.get(target - nums[i]);
            /*
            no match found, add the current item and index to map
             */
            if(value == null){
                map.put(nums[i],i);
            }else{
                // match found , update the index value
                result[0] = value;
                result[1] = i;
            }
        }
        return result;
    }
}
