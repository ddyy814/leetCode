/**
 * (463) Island Perimeter
 * You are given a map in form  of a two-dimensional integer grid where i represents land and 0 represent water.
 *
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and
 * there is exactly one island (i.e., one or more connected land cells).
 *
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a
 * square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the
 * island.
 *
 * Example:
 * Input:           [[0,1,0,0],
 *                   [1,1,1,0],
 *                   [0,1,0,0],
 *                   [1,1,0,0]]
 * Output: 16
 *
 * Explanation: The perimeter is the 16 yellow stripes in the image below:
 *
 *
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Island_Perimeter {
    public int islandPerimeter(int[][] grid){
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int land = 0;
        int overlap = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                //if gird[i][j] = 1, means it is a land
                if(grid[i][j] == 1){
                    land++;
                    // check grid[i][j](当前陆地)和 grid[i+1][j](下面的陆地),是否相等
                    if(i < grid.length - 1 && grid[i][j] == grid[i + 1][j]){
                        overlap++;      // 都是陆地的话，就找到一次重合
                    }
                    // check grid[i][j](当前陆地)和 gird[i][j+1](右边陆地)，是否相等
                    if(j < grid[i].length - 1 && grid[i][j] == grid[i][j + 1]){
                        overlap++;  //都是陆地的话， 找到一次重合
                    }
                }
            }
        }
        return 4 * land - 2 * overlap;      // an island has 4 edges, and two edges are overlap at one time.
    }
}
