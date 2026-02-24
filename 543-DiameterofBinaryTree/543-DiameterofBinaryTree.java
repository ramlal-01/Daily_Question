// Last updated: 24/2/2026, 3:21:30 pm
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
17    int max = 0 ;
18    public int diameterOfBinaryTree(TreeNode root) {
19        helper( root );
20        return max ;
21    }
22
23    public int helper( TreeNode root ){
24        if( root == null ){
25            return 0 ;
26        }
27
28        int left = helper( root.left) ;
29        int right = helper( root.right );
30
31        max = Math.max( max , left+right );
32
33        return 1+Math.max(left,right);
34    }
35}