/**
 * (344) Reverse String
 *
 * Write a function that reverses a string. The inpt string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1)
 * extra memory.
 * You may assume all the characters consist of printable ascii characters
 *
 * 不能用额外的空间去创建新的array， 必须要input array上做个修正，然后直接output出来
 *
 * Example 1:
 * Input: ["h","e", "l", "l", "o"]
 * Output: ["o", "l", "l", "e", "h"]
 *
 * Example 2:
 * Input: ["H", "a", "n", "n", "a", "h"]
 * Output: ["h", "a", "n", "n", "a", "H"]
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 *
 */
public class ReverseString {
    public void reverseString(char[] s){

        int result = s.length - 1;
        for(int i = 0; i < s.length / 2; i++){
            char tmp = s[i];    // s[0]
            // example: Array: 4.   index: 0,1,2,3
            // i = 0, s[0], s[result] = s.length - 1 = 4 - 1, s[3]. s[0] reverse with s[3], s[3]是最后一位
            s[i] = s[result];
            s[result] = tmp;
            result--;
        }
    }
}
