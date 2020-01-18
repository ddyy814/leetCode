import java.util.ArrayList;
import java.util.List;

/**
 * (682) Baseball Game
 * You're now a baseball game point recorder.
 * Given a list of strings, each string can be one of the 4 following types:
 *  1. Integer (one round's score): Directly represents the number of points you get in this round;
 *  2. "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points
 *  3. "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points
 *  4. "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid
 *  and should be removed.
 *
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * You need to return the sum of the points you could get in all the rounds.
 *
 * Example 1:
 * Input: ["5","2","C","d","+"]
 * Output: 30
 * Explanation:
 * Round 1: You could get 5 points, the sum is 5
 * Round 2: You could get 2 points ,the sum is 2
 * Operation 1: The round 2's data was invalid, the sum is 5.
 * Round 3: You could get 10 points (the round 2's data has been removed), the sum is 15
 * Round 4: You could get 5 + 10 = 15 points, the sum is 30
 *
 *
 * Example 2:
 * Input: ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation:
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get -2 points. The sum is: 3.
 * Round 3: You could get 4 points. The sum is: 7.
 * Operation 1: The round 3's data is invalid. The sum is: 3.
 * Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
 * Round 5: You could get 9 points. The sum is: 8.
 * Round 6: You could get -4 + 9 = 5 points. The sum is 13.
 * Round 7: You could get 9 + 5 = 14 points. The sum is 27.
 *
 * Note:
 * 1. The size of the input list will be between 1 and 1000
 * 2. Every integer represented in the list will be between -30000 and 30000
 *
 *
 * Time complexity:
 * Space complexity:
 *
 * Easy level
 */
public class Baseball_Game {
    public int calPoints(String[] ops){
        List<Integer> list = new ArrayList<Integer>();
        for(String o : ops){
            int n = list.size();
            if(o.equals("+")){
                list.add(list.get(n - 1) + list.get(n - 2));
            }else if(o.equals("C")){
                list.remove(n - 1);
            }else if(o.equals("D")){
                list.add(list.get(n - 1) * 2);
            }else{
                list.add(Integer.parseInt(o));
            }
        }
        return list.stream().reduce(0, Integer::sum);
    }
}
