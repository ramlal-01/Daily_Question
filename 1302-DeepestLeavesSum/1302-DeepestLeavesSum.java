// Last updated: 22/8/2025, 11:00:06 am
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
    public int deepestLeavesSum(TreeNode root) { 
        int sum =0 ; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size(); 
            sum=0;
            for( int i = 0 ; i<size ; i++){
                TreeNode n = q.poll(); 
                sum+=n.val;
                if( n.left!=null) q.add(n.left);
                if( n.right!=null) q.add(n.right);
            } 
        }

        return sum ;
    }
 
}