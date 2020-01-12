/**
 * (14) Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings
 * If there is no common prefix, return an empty string ""
 *
 * Example 1:
 * Input: ["flower", "flow", "flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: ["dog", "racecar", "car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Note all given inputs are in lowercase letters a-z
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";
        String result = strs[0];    // use the first string as result
        for(int i = 1; i < strs.length; i++){
            // indexOf 用于查找string中的result是否在上面的result当中
            while(strs[i].indexOf(result) != 0) {
                result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
