/**
 * (20) Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. open brackets mst be closed by the same type of brackets
 * 2. Open brackets must be closed in the correct order.
 *
 * Example 1:
 * Input: "()"
 * Output: true
 *
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: "(]"
 * Output: false
 *
 * Example 4:
 * Input: "([)]
 * Output: false
 *
 * Example 5:
 * Input: "{[]}"
 * Output: true
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * Easy level
 *
 */
public class Valid_Parentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c == '{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
