/**
 * (100) Same Tree
 *
 * Given two binary trees, write a function to check if they are equal or not;
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *          Input:
 *              1                           1
 *             / \                         / \
 *            2   3                       2   3
 *           [1,2,3]                     [1,2,3]
 *          Output: True
 *
 * Example 2:
 *         Input:
 *              1                       1
 *             /                         \
 *            2                           2
 *           [1,2]                    [1,null,2]
 *         Output: False
 *
 * Example 3:
 *         Input:
 *              1                           1
 *             / \                         / \
 *            2   1                       1   2
 *           [1,2,1]                     [1,1,2]
 *         Output: False
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 *
 * Easy level
 *
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;     // if they are null, return true. means they are same
        else if(p == null || q == null) return false;   // either p or q is null, return false. means they are diff
        else{
            // return value of p and q when they are same
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
