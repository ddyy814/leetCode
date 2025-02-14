import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * (637) Average of Levels in Binary Tree
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array
 *
 * Example 1:
 * Input:
 *                          3
 *                         / \
 *                        9  20
 *                          /  \
 *                         15   7
 *
 * Output: [3,14.5,7]
 * Explanation:
 * The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11. Hence return [3,14.5,11]
 *
 * Note:
 *  1. The range of node's value is in the range of 32-bit signed integer.
 *
 *  Time complexity: O(n)
 *  Space complexity: O(1)
 *
 *  Easy level
 *
 *
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();        //当前root踢出去
                sum = sum + current.val;        // sum = 当前数值 + sum (第一轮是0)
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(sum / size);
        }
        return result;
    }
}
