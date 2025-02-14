/**
 * (680) Valid Palindrome II
 * Given a non-empty string s, you may delete at most one character, Judge whether you can make it a palindrome.
 *
 * Example 1:
 * Input: "aba"
 * Output: True
 *
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 *
 * Note:
 * 1. The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 *
 * Time complexity: O(n)
 * Space complexity:
 *
 * Easy level
 *
 */
public class Valid_Palindrome_II {
    public boolean validPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                return isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r);
            l++;
            r--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
