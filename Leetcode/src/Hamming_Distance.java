/**
 * (461) Hamming Distance
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance;
 * Note : 0 <= x, y < 2^31.
 *
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 *
 * Explanation:
 * 1    (0 0 0 1)
 * 4    (0 1 0 0)
 *         ?   ?
 *
 * Time complexity: O(log n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Hamming_Distance {
    public int hammingDistance(int x, int y){
        // store result
        int result = 0;
        // iteration 31 times
        for(int i = 0; i < 31; i++){
            int bx = x % 2; // convert to binary. if result is 0, it is 0. if result is 1, it is 1.
            int by = y % 2; // convert to binary. if result is 0, it is 0. if result is 1, it is 1.
            // if bit x is not equal bit y
            if(bx != by)
                result++;   // result ++
            x /= 2; // shift to right 1 spot
            y /= 2; // shift to right 1 spot
        }
        return result;
    }
}
