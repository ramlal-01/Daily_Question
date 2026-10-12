// Last updated: 12/10/2026, 7:16:29 pm
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
17    int maxi = 0 ;
18    public int longestZigZag(TreeNode root) {
19        helper(root,0,false ) ;
20         helper( root , 0 , true) ;
21         return maxi ;
22    }
23
24    public void helper( TreeNode root , int steps , boolean left  ){
25        if( root==null ){
26            return  ;
27        }
28
29        maxi = Math.max( maxi , steps );
30
31        if( left == true ){
32            helper( root.left , steps+1 , false );
33            helper( root.right, 1 , true ) ;
34        }
35        else {
36            helper(root.right , steps+1 , true );
37            helper( root.left , 1 , false ) ;
38        }
39    }
40}