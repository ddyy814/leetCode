import javax.swing.tree.TreeNode;

/**
 * (543) Diameter of Binary Tree
 *
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is
 * the length of the longest path between any two nodes in a tree. This path may or may not pass through the root
 *
 * Example:
 * Given a binary tree
 *
 *                          1
 *                         / \
 *                        2   3
 *                       / \
 *                      4   5
 *
 * Return 3. which is the length of the path [4,2,1,3] or [5,2,1,3]
 * Note: the length of path between two nodes is represented by the number of edges between them.
 *
 *
 * Time complexity: O(n)
 * Space complexity: O(height)
 *
 *
 * Easy level
 *
 */
public class DiameterOfBinaryTree {
    int result = 1;
    public int diameterOfBinaryTree(TreeNode root){
        depth(root);
        return result - 1;
    }
    private int depth(TreeNode root){
        if(root == null) return 0;
        int L = depth(root.left);
        int R = depth(root.right);
        result = Math.max(result, L + R + 1);
        return Math.max(L, R) + 1;
    }
}
