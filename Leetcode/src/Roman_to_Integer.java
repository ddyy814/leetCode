/**
 * (13) Roman to Integer
 * Roman numeral are represented by seven different symbols: I,V,X,L,C,D, and M.
 * Symbol                       Value
 *   I                             1
 *   V                             5
 *   X                            10
 *   L                            50
 *   C                           100
 *   D                           500
 *   M                          1000
 *
 * For example,two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which
 * is simply X + II. The number twenty seven is written as XXVI, which is XX + V + I
 * Roman numeral are usually written largest to smallest from the left to right. However, the numeral for four is not
 * IIII. Instead, the number four is written as IV. Because the one if before the five we subtract it making four. The
 * same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *  I can be placed before V (5) and x (10) to make 4 and 9
 *  X can be placed before L (50) and c (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900
 *
 *  Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999
 *
 *  Example 1:
 *  Input: III
 *  Output: 3
 *
 *  Example 2:
 *  Input: IV
 *  Output: 4
 *
 *
 *  Example 3:
 *  Input: IX
 *  Output: 9
 *
 *  Example 4:
 *  Input: LVIII
 *  Output: 58
 *  Explanation: L = 50, V = 5, III = 3
 *
 *  Example 5:
 *  Input: MCMXCIV
 *  Output: 1994
 *  Explanation: M = 1000, CM = 900, XC = 90, IV = 4
 *
 *
 *  Time complexity: O(n)
 *  Space complexity: O(1)
 *
 *  Easy level
 */
public class Roman_to_Integer {
    public int romanToInt(String s){
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        // finding specific value CM, CD, IC, IL, IX, IV
        if(s.indexOf("CM") != -1) result -= 200; // if input in range of String, result - 200
        if(s.indexOf("CD") != -1) result -= 200;
        if(s.indexOf("IC") != -1) result -= 20;
        if(s.indexOf("IL") != -1) result -= 20;
        if(s.indexOf("IX") != -1) result -= 2;
        if(s.indexOf("IV") != -1) result -= 2;
        for(char c : s.toCharArray()){
            if(c == 'M') result += 1000;
            else if(c == 'D') result += 500;
            else if(c == 'C') result += 100;
            else if(c == 'L') result += 50;
            else if(c == 'X') result += 10;
            else if(c == 'V') result += 5;
            else if(c == 'I') result += 1;
        }
        return result;
    }
}
