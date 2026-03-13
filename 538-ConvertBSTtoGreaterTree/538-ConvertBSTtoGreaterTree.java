// Last updated: 13/3/2026, 4:29:23 pm
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
17    int sum = 0;
18
19    public TreeNode convertBST(TreeNode root) {
20        if( root==null ) return null ;
21
22        convertBST(root.right) ;
23        sum+= root.val ;
24        root.val = sum ;
25        convertBST( root.left ) ;
26        return root ;
27    }
28}