// Last updated: 22/8/2025, 4:26:06 pm
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        inorder( root , list );
        int a = 0,b=0;
        for( int i =0 ; i<list.size() ; i++){
            if( list.get(i)==low){
                a = i;
            }
            if( list.get(i)==high) b=i;
        }
        int sum=0 ;
        while( a<=b){
            sum+= list.get(a);
            a++;
        }
        return sum;
    }

    public void inorder( TreeNode root , List<Integer> list){
        if(root == null) return ;
        inorder( root.left , list);
        list.add( root.val);
        inorder( root.right , list);
    }
}