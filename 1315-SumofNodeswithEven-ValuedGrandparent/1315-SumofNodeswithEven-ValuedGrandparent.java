// Last updated: 24/8/2025, 12:44:42 am
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
    int sum = 0 ;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root , null , null);
        return sum;
    }

    public void dfs ( TreeNode root ,TreeNode parent , TreeNode grandparent ){
        if( root == null) return  ;

        if( grandparent!=null && grandparent.val%2==0) sum+=root.val;

        dfs( root.left , root , parent);
        dfs( root.right , root , parent);
    }
}