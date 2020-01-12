/**
 * (404) Sum of Left Leaves
 *
 * Find the sum of all left leaves in a given binary tree
 *
 * Example:
 *              3
 *             / \
 *            9   20
 *               /  \
 *              15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 *
 * Easy level
 *
 * Time complexity: O(n)
 * Space complexity: O(h)
 *
 * Algorithm: recursion
 */
public class Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;

        //define sum value is 0
        int sum = 0;

        // if it has left child, and root.left is leave. Define the root.left.left and root.left.right is null. sum is
        // left.value
        //如果它有左指数，而且左指数是个leave的话，它左指数的左节点和右节点都为null.
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum = root.left.val;
        }
        // sum + leftleaves' sum （左指数左节点的和） + root.right.left's sum （右指数所有左节点的和）
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
