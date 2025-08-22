// Last updated: 23/8/2025, 1:15:37 am
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }1111111111116-4444225
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs( root.left , root.right);
    }

    public boolean dfs( TreeNode root1 , TreeNode root2){
        if( root1==null || root2==null){
            return root1==root2;
        }

        return root1.val==root2.val && dfs( root1.left , root2.right ) && dfs( root1.right, root2.left);
    }
}