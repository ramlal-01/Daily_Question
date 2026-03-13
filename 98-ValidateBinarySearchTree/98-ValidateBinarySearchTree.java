// Last updated: 13/3/2026, 11:41:07 am
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isValidBST(TreeNode root) {
18        return validate( root , Long.MAX_VALUE , Long.MIN_VALUE ) ;
19    }
20    public boolean validate( TreeNode root , long max , long min){
21        if( root==null ) return true ;
22
23        if( root.val<= min || root.val>=max ) return false ;
24        
25
26        boolean left = validate( root.left , root.val , min ) ;
27        boolean right = validate( root.right , max , root.val ) ;
28        
29        return left&&right ;
30    }
31}