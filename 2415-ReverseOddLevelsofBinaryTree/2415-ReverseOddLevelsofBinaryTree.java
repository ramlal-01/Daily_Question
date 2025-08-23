// Last updated: 24/8/2025, 1:27:53 am
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {

        if(root == null)
        return root;
        helper(root.left, root.right, 1);
        return root;
        
    }

    void helper(TreeNode left, TreeNode right, int l){
        if(left == null || right == null) return;

        if(l%2 == 1){
            int temp = left.val;
            left.val =right.val;
            right.val = temp;
        }

        helper(left.left, right.right, l+1);
        helper(left.right, right.left, l+1);
    }
}