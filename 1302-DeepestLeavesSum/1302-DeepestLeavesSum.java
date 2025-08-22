// Last updated: 22/8/2025, 10:57:23 am
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
        List<List<Integer>> list = new ArrayList<>();
        
        int sum[] = {0} ;
        levelorder(root ,list , sum);

        // System.out.println( list[0]);
        // for(int i = 0 ; i<  list.get(list.size()-1 ).size() ; i++ ){
        //     sum+= list.get(list.size()-1 ).get(i);
        // }
        return sum[0] ;
    }

    public void levelorder( TreeNode root , List<List<Integer>> list , int[] sum){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> arr = new ArrayList<>();
            sum[0]=0;
            for( int i = 0 ; i<size ; i++){
                TreeNode n = q.poll();
                arr.add(n.val);
                sum[0]+=n.val;
                if( n.left!=null) q.add(n.left);
                if( n.right!=null) q.add(n.right);
            }

            list.add(arr);
        }
    }
}