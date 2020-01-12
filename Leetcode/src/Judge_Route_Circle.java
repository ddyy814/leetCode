/**
 * (657) Judge Route Circle
 *
 * Initially, there is a Robot at position(0,0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 *
 * 在2D平面上有一个机器人从原始点（0，0）位置开始移动。 给出一系列的移动后判断该机器人是否最后回到原点（0，0）
 *
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (right), L (left), U (up), D (down). The output should be true of false representing
 * whether the robot makes a circle.
 *
 * 移动序列是有字符串（string）表示， 字符move[i]表示其第i个动作。有效的上， 下，左， 右移动。 如果机器人在完成给定的移动后回到
 * 原点（0，0），返回true，否则返回false。
 *
 * Example 1:
 * Input: "UD"
 * Output: true
 *
 * Example 2:
 * Input: "LL"
 * Output false
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Judge_Route_Circle {
    public boolean JudgeRouteCircle(String moves){
        // initial x and y value
        int x = 0, y = 0;
        for(char move : moves.toCharArray()){
            // using switch --> case to do this problem
            switch (move){
                case 'U' : y++; break;
                case 'D' : y--; break;
                case 'L' : x--; break;
                case 'R' : x++; break;
            }
        }
        return x == 0 && y == 0;
    }
}
