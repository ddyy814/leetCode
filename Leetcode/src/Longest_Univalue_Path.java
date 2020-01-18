import javax.swing.tree.TreeNode;

/**
 * (687) Longest Univalue Path
 *
 * Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may
 * or may not pass through the root.
 * The length of path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * Input:
 *                          5
 *                         / \
 *                        4   5
 *                       / \   \
 *                      1   1   5
 *
 * Output: 2
 *
 * Example 2:
 * Input:
 *                          1
 *                         / \
 *                        4   5
 *                       / \   \
 *                      4   4   5
 *
 * Output: 2
 *
 * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */
public class Longest_Univalue_Path {
    private int result = 0;

    public int longestUnivaluePath(TreeNode root){
        calculate(root);
        return result;
    }
    public int calculate(TreeNode root){
        if(root == null) return 0;
        int leftCount = calculate(root.left); // return 一个右子树leftCount最小路径的值
        int rightCount = calculate(root.right); // return 一个左子树rightCount最小路径的值
        int left = 0, right = 0;
        //左子树顶点的值和root的值一样
        if(root.left != null && root.left.val == root.val){
            left = leftCount + 1; //left要更新了，+ 1
        }
        if(root.right != null && root.right.val == root.val){
            right = rightCount + 1;
        }
        result = Math.max(result, left + right); //update calculate
        return Math.max(left, right);  //返回left或者right一边的最大值
    }
}
