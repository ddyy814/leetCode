/**
 * (9) Palindrome Number 指顺读和逆读都一样的数字
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward
 *
 * Example 1:
 * Input: 121
 * Output: true
 *
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation:
 * From left to right, it reads -121. From right to left, it become 121-. Therefore it is not a palindrome
 *
 * Follow up:
 * Could you solve it without converting the integer to string?
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 *
 */
public class Palindrome_Number {
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        // determine div, div is 一共多少位
        int div = 1; int num = x;
        while(num / div >= 10){ //  if < 10 , it is not palindrome
            div *= 10;
        }
        while(num != 0){
            int left = num / div; // the highest digit place of number such as 12321 is 1 (the first 1)
            int right = num % 10;   // the lowest digit place of number such  as 12321 is 1 (the last 1)
            if(left != right) return false; // if two value is not equal ,return false
            num = (num - left * div) / 10; // the new number is 把最高位减掉，把最低位拿掉
            div /= 100; // div / 100 because we take two digits place off.
        }
        return true;
    }
}
