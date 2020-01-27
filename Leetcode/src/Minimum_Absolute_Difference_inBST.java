import javax.swing.tree.TreeNode;

/**
 * (530) Minimum Absolute Difference in BST
 *
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two
 * nodes.
 *
 * Example:
 *
 * Input:
 *
 *                          1
 *                           \
 *                            3
 *                           /
 *                          2
 *
 * Output: 1
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 *
 * Note: There are at least two nodes in this BST
 *
 * Time complexity: O(n)
 * Space complexity: O(log n)
 *
 * Easy level
 */
public class Minimum_Absolute_Difference_inBST {
    private Integer previous = null;
    private int diff = Integer.MAX_VALUE;   //存取当前遍历中获取的最小值， absolute minimum value

    public int getMinimumDifference(TreeNode root){
        inorder(root);  // 进行中序遍历
        return diff;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left); // 在中序遍历中，递归左指数
        if(previous != null) // previous不为空的话
            diff = Math.min(diff, root.val - previous);     // 当前根结点值 - previous， 然后和minimum diff比较， 取小的，更新min.diff.
        previous = root.val;    //root value存到 previous里去
        inorder(root.right);
    }
}
