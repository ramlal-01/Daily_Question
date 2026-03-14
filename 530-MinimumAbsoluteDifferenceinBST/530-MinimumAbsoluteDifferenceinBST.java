// Last updated: 14/3/2026, 11:15:56 am
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
17    int min = Integer.MAX_VALUE ;
18    TreeNode prev = null ;
19    public int getMinimumDifference(TreeNode root) {
20        helper( root ) ;
21        return min ;
22    }
23    public void helper( TreeNode root ){
24        if( root==null ){
25            return ;
26        }
27
28        helper(root.left) ;
29        
30        if( prev!=null ) min = Math.min( min , Math.abs(root.val - prev.val ));
31        prev = root ; 
32
33        helper(root.right) ;
34    }
35}