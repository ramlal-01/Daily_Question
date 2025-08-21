// Last updated: 21/8/2025, 7:30:13 am
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root == null) return list ; 

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while( !st.isEmpty()){
            TreeNode n = st.pop();
            
            list.add(n.val);
            
            if(n.right!=null) st.push(n.right);
            if(n.left!=null) st.push(n.left);
        }
        return list;
    }
}