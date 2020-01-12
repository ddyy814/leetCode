/**
 * (120) Triangle
 *
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the
 * row below.
 *
 * Example:
 *              [2]
 *             [3,4]
 *            [6,5,7]
 *           [4,1,8,3]
 *
 * The minimum path sum from top to bottom is 11 (2 + 3 + 5 + 1 = 11)
 *
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows
 * in the triangle.
 *
 * Algorithm: Dynamic programming
 *
 * Time complexity: O(n^2)
 * Space complexity: O(n)
 *
 *
 * Medium level
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle){
        int height = triangle.size();   // triangle's height

        // the last height of triangle's size 最后一行数最多，作为数组列数来用
        int width = triangle.get(triangle.size() - 1).size();

        int[][] result = new int[height][width];

        // fill up the last row of triangle
        for(int i = 0; i < width; i++){
            result[height - 1][i] = triangle.get(height - 1).get(i); //最后一行到底部的距离就等于它自身的值
        }

        // search from down to top
        for(int i = height - 2; i >= 0; i--){
            for(int j = 0; j < i; j++){
                result[i][j] = triangle.get(i).get(j) + Math.min(result[i + 1][j], result[i + 1][j + 1]);
            }
        }
        return result[0][0];
    }
}
