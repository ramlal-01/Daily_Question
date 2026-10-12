// Last updated: 12/10/2026, 6:22:01 pm
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
17    int cnt =0 ;
18    public int goodNodes(TreeNode root) {
19        helper( root , root.val ) ;
20        return cnt ;
21    }
22    public void helper( TreeNode root , int max ){
23        if( root==null ){
24            return  ;
25        }
26        if( root.val >=max ){
27            cnt++;
28        }
29        max = Math.max( max , root.val ) ;
30        helper( root.left , max );
31
32        helper( root.right , max ) ;
33    }
34}