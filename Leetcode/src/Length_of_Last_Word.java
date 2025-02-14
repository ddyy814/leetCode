/**
 * (58) Length of Last Word
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last
 * word(last word means the last appearing word if we loop from left to right) in the string.
 *
 * If the last word does not exist, return 0;
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 *
 * Example:
 * Input: "Hello World"
 * Output: 5
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Length_of_Last_Word {
    public int lengthOfLastWord(String s){
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}
