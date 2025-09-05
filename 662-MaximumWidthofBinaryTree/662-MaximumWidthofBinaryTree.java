// Last updated: 5/9/2025, 11:47:03 am
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

class Pair{
    TreeNode node;
    int ind ;

    Pair( TreeNode r , int n){
        node = r;
        ind = n;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if( root==null) return 0;

        Queue<Pair> q = new LinkedList<>();
        int width = 0;

        q.add( new Pair(root,0));

        while( !q.isEmpty()){
            int size = q.size();
            int first =0 , last =0 ;
            int mmin = q.peek().ind ;

            for (int i=0 ; i<size ; i++){
                int curr = q.peek().ind - mmin ;
                TreeNode cnode = q.peek().node;
                q.poll();

                if( i==0) first = curr;
                if( i==size-1) last = curr;
                if( cnode.left!=null) q.add( new Pair(cnode.left, 2*curr+1));
                if( cnode.right!=null ) q.add( new Pair( cnode.right , 2*curr+2));
            }
            width = Math.max( width ,last - first +1) ;
        }

        return width ;
    }
}