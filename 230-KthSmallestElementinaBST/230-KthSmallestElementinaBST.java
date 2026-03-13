// Last updated: 13/3/2026, 12:12:25 pm
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
17    int cnt = 0 ;
18    int ans = -1 ;
19    public int kthSmallest(TreeNode root, int k) {
20       
21        helper( root , k ) ;
22        return ans ;
23    }
24
25    public void helper( TreeNode root , int k ){
26        if( root==null || ans!=-1) return ;
27
28    
29        helper( root.left , k );
30        cnt++;
31        if( cnt ==k )  ans = root.val ;
32
33        helper( root.right , k ) ;
34    }
35}