/**
 * (409) Longest Palindrome
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can
 * be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note: Assume the length of given string will not exceed 1,010.
 *
 * Example:
 * Input: "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 *
 * Algorithm: Greedy
 *
 *
 * Easy level
 */
public class Longest_Palindrome {
    public int longestPalindrome(String s){
        int[] count = new int[128];

        //计算所有字符出现次数
        for(char c : s.toCharArray())
            count[c]++;
        int result = 0;
        for(int t : count){
            result += t / 2 * 2;        //整除并得出得数
            if(result % 2 == 0 && t % 2 == 1)
                result++;
        }
        return result;
    }
}
