import javax.swing.tree.TreeNode;

/**
 * (110) Balanced Binary Tree
 *
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of
 * every node never differ by more than 1.
 *
 * Example 1:
 * Given the following tree [3,9,20,null,null,15,7]
 *
 *                  3
 *                 / \
 *                9  20
 *                  /  \
 *                 15   7
 *    Return: true
 *
 * Example 2:
 * Given the following tree [1,2,2,3,3,null,null,4,4]
 *
 *                  1
 *                 / \
 *                2   2
 *               / \
 *              3  3
 *             / \
 *            4   4
 *     Return: false
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 */
public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        return (treeHeight(root) != -1);    //this root return -1 means unbalanced tree, return 1 means balanced tree
    }
    public int treeHeight(TreeNode root){
        if(root == null) return 0;
        int leftDepth = treeHeight(root.left);      // root.left = as a new root
        int rightDepth = treeHeight(root.right);    // root.right = as a new root
        if(leftDepth == -1 || rightDepth == -1) return -1; //either left or right is unbalanced binary, return -1
        if(Math.abs(leftDepth - rightDepth) > 1) return -1; // if height (left.height - right.height) > 1, return -1
        return(Math.max(leftDepth,rightDepth) + 1);
    }
}
