import java.util.ArrayList;

/**
 * (655) Print Binary Tree
 *
 * Print a binary tree in an m*n 2D string array following these rules:
 * 1. The row number m should be equal to the height of the given binary tree.
 * 2. The column number n should always be an odd number
 * 3. The root node's value ( in string format) should be put in the exactly middle of the first row it can be put.
 * The column and the row where the root node belongs will separate the rest space into two parts (left-bottom part and
 * right-bottom part). You should print the left subtree in the left-bottom part and print the right subtree in the
 * right-bottom part. The left-bottom part and the right-bottom part should have the same size. Even if one subtree is
 * none while the other is not, you don't need to print anything for the none subtree but still need to leave the space
 * as large as that for the other subtree. However, if two subtrees are none, then you don't need to leave space for
 * both of them.
 * 4. Each unused space should contain an empty string "".
 * 5. Print the subtrees following the same rules;
 *
 *
 *
 * Example 1:
 *
 * Input:
 *                  1
 *                 /
 *                2
 * Output:
 *              [ [ "", "1", "" ],
 *                [ "2", "", "" ]]
 *
 * Example 2:
 *
 * Input:
 *                  1
 *                 / \
 *                2   3
 *                \
 *                4
 * Output:
 *              [ [ "", "", "", "1", "", "", ""],
 *                [ "", "2", "", "", "", "3", "" ],
 *                ["", "", "4", "", "", "", "" ] ]
 *
 * Example 3:
 *
 * Input:
 *                  1
 *                 / \
 *                2   5
 *               /
 *              3
 *             /
 *            4
 *
 * Output:
 *              [ [ "", "", "", "", "", "", "", "1", "", "", "", "", "", "", ""]
 *                [ "", "", "", "2", "", "", "", "", "", "", "", "5", "", "", ""]
 *                [ "", "3", "", "", "", "", "", "", "", "", "", "", "", "", ""]
 *                [ "4", "", "", "", "", "", "", "", "", "", "", "", "", "", ""] ]
 *
 * Note: The height of the binary tree is in the range 1-10.
 *
 *
 * Algorithm: Recursion
 *
 * Time complexity: O(m*n)
 * Space complexity: O(m*n)
 *
 *
 * Medium level
 *
 * /**
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode(int x) { val = x; }
 *  * }
 *
 */


public class Print_Binary_Tree {
    public List<List<String>> printTree(TreeNode root){
        List<List<String>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        // get height;
        int h = getHeight(root);
        // get width, 2 ^ h - 1
        int w = (1 << h ) - 1;

        for(int i = 0; i < h; i++){
            result.add(new ArrayList<>());
            List<String> current = result.get(i);
            for(int j = 0; j < w; j++){
                current.add("");
            }
        }
        fill(root, result, 0, 0, w - 1);    // implement fill method by initial values
        return  result;
    }

    // define and get the height of tree using recursion
    private int getHeight(TreeNode root){
        if(root == null) return 0;      // if the root of tree equal null , return 0
        // find and determine which height is bigger, left or right, and then the bigger height + 1
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    private void fill(TreeNode root, List<List<String>> result, int height, int left, int right) {
        // check root whether or not is null, if it is null, return
        if (root == null) return;
        // if root is not null, calculate root position in 2D array
        int mid = (left + right) / 2;

        // convert int to String
        result.get(height).set(mid, String.valueOf(root.val));

        fill(root.left, result, height + 1, left, mid - 1);     // fill up the tree
        fill(root.right, result, height + 1, mid + 1, right);    // fill up the tree
    }
}
