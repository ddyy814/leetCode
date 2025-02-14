import java.util.Arrays;

/**
 * (455) Assign Cookies
 * Assume you are an awesome parent and wat to give your children some cookies. But, you should give each child at most
 * one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content
 * with; and each cookie j has a size sj. if sj >= gi, we can assign the cookie j to the child i , and the child i will
 * be content. Your goal is to maximize the number of your content children and output the maximum number;
 *
 * Note:
 * You may assume the greed factor is always positive.      确定贪婪数永远是正数
 * You cannot assign more then one cookie to one child.     一个饼干只能给一个小孩
 *
 * Example 1:
 * Input:   [1,2,3], [1,1]
 * Output: 1
 * Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1,2,3.
 * And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is
 * 1 content.
 * You need to output 1
 *
 *
 * Example 2:
 * Input:   [1,2], [1,2,3]
 * Output: 2
 * Explanation: You have 3 children and 2 cookies. The greed factor of 2 children are 1, and 2.
 * You have 3 cookies and their sizes are big enough to gratify all of the children.
 * You need to output 2.
 *
 * Algorithm: greed
 *
 * Time complex: sort -> O( nlogn + mlogm)            (enumeration)枚举(计数)小孩和cookies -> O(n + m)
 * Space complexity: O(1)
 *
 * Easy level
 *
 */
public class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s){

        if(g == null || s == null) return 0;
        // sort g and s
        Arrays.sort(g);     // O(g log(g))
        Arrays.sort(s);     // O(m log(m))

        // initial i and j
        int i = 0;  // satisfy children
        int j = 0;  // pointer to cookie

        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                i++;
            }
            j++;
        }
            return i;
    }
}
