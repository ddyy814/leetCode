/**
 * (617) Merge Two Binary Trees
 *
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees
 * are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up
 * as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 * Input:
 *                      Tree 1                              Tree 2
 *                        1                                   2
 *                       / \                                 / \
 *                      3   2                               1   3
 *                     /                                     \   \
 *                    5                                      4    7
 *
 * Output:
 * Merged tree:
 *                      3
 *                     / \
 *                    4   5
 *                   / \   \
 *                  5   4   7
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * Easy level
 *
 *
 */
public class Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        TreeNode newHead = new TreeNode(t1.val + t2.val);
        newHead.left = mergeTrees(t1.left, t2.left);
        newHead.right = mergeTrees(t1.right, t2.right);
        return newHead;
    }
}
