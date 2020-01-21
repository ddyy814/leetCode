/**
 * (744) Find Smallest Letter Greater Than Target
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target,
 * find the smallest element in the list that is larger than the given target.
 *
 * Letters also wrap around. For example, if the target is  = 'z' and letters = ['a','b'], the answer is 'a'.
 *
 * Example:
 * Input:
 * letters = ["c", "f", "j"]
 * target = "a"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "c"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "g"
 * Output: "j"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "j"
 * Output: "c"
 *
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 *
 * Note:
 * 1. letters has a length range [2, 10000].
 * 2. letters consists of lowercase letters, and contains at least 2 unique letters;
 * 3. target tis a lowercase letter.
 *
 * Time complexity: O(log n)
 * Space complexity: O(1)
 *
 *
 * Easy level
 */
public class Find_Smallest_Letter_Greater_than_Target {
    public char nextGreatestLetter(char[] letters, char target){
        int left = 0, right = letters.length;
        while(left < right){
            int mid = left + (right - left) / 2; // avoid overflow
            if(letters[mid] <= target)  //如果letters[mid] <= target，肯定不是解，找出第一个比target大的数
                left = mid + 1; // 空间往右移动
            else right = mid;   // 否则，空间往左移
        }
        return letters[left % letters.length];  // 返回0 ，所以left % letters.length 就可以如果等于0的话
    }
}
