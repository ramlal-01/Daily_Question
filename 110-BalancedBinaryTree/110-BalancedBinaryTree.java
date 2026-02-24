// Last updated: 24/2/2026, 3:22:44 pm
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
17    public boolean isBalanced(TreeNode root) {
18        if( helper(root)==-1 ) return false ;
19        return true;
20    }
21
22    public int helper( TreeNode root ){
23        if( root==null ){
24            return 0 ;
25        }
26        int left = helper(root.left) ;
27        if( left==-1) return -1 ;
28
29        int right = helper( root.right);
30        if( right==-1 ) return -1 ;
31
32        if( Math.abs( left-right )>1 ) return -1 ;
33
34        return 1+Math.max( left , right );
35    }
36}