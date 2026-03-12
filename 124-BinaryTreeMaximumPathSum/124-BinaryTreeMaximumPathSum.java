// Last updated: 12/3/2026, 2:57:42 pm
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
17    int max = Integer.MIN_VALUE ; 
18    public int maxPathSum(TreeNode root) {
19        helper( root );
20        return max ;
21    }
22    public int helper( TreeNode root ) {
23        if( root==null ) return 0 ;
24        
25        int left = Math.max( 0, helper( root.left ) ) ;
26        int right = Math.max( 0 , helper( root.right ) ) ;
27
28        max = Math.max( max , root.val + left + right ) ;
29
30        return root.val + Math.max(left, right ) ;
31    }
32}