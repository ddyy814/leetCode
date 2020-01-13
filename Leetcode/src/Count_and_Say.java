/**
 * (38) Count and Say
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.   1
 * 2.   11
 * 3.   21
 * 4.   1211
 * 5.   111221
 *
 * 1 is read off as "one 1" or 11.              一个 1
 * 11 is read off as "two 1s" or 21.            两个 1
 * 21 is read off as "one 2, then one " or 1211.        一个2， 一个1
 *
 * Given an integer n where i <= n <= 30, generate the n^th term of the count-and-say sequence. You can do so recursively,
 * in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
 *
 * Note: Each term of the sequence of integers will be represented as string
 *
 * Example 1:
 * Input: 1
 * Output: "1"
 * Explanation: This is the base case
 *
 * Example 2:
 * Input: 4
 * Output: "1211"
 * Explanation: For n = 3 the terms was "21" in which we have two groups "2" and "1", "2" can be read as "12" which
 * means frequency = 1 and value = 2, the same way "1" is read as "11", so the answer is the concatenation of "12" and
 * "11" which is "1211"
 *
 *
 * Time complexity:
 * Space complexity:
 *
 * Easy level
 *
 */
public class Count_and_Say {
    public String countAndSay(int n){
        if(n == 1) return "1";
        String value = countAndSay(n - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < value.length(); i++){
            int count = 1;
            while(i < value.length() && value.charAt(i) == value.charAt(i + 1)){
                count++;
                i++;
            }
            stringBuilder.append(count;
            stringBuilder.append(value.charAt(i));
        }
        return stringBuilder.toString();
    }
}
