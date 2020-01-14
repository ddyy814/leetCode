/**
 * (504) Base 7
 *
 * Given an integer, return its base 7 string representation
 *
 * Example 1:
 * Input: 100
 * Output: "202"
 *
 * Example 2:
 * Input: -7
 * Output: "-10"
 * Note: The input will be in range of [-1e7, 1e7]
 *
 *
 * Time complexity:
 * Space complexity:
 *
 * Easy level
 *
 *
 */
public class Base_7 {
    public String converToBase7(int num){
        if(num == 0){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int tmp = Math.abs(num);
        while(tmp > 0){
            int value = tmp % 7;
            tmp /= 7;
            stringBuilder.append("" + value);
        }
        if(num < 0){
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }
}
