// Last updated: 10/9/2026, 3:48:45 pm
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
18    public int averageOfSubtree(TreeNode root) {
19        if( root == null ) return 0 ;
20
21        dfs(root);
22
23        return cnt ;
24    }
25
26    private int[]  dfs( TreeNode root  ){
27        if( root==null){
28            return new int[]{0,0} ; 
29        }
30
31        int x[] = dfs( root.left ) ;
32        int y[] = dfs( root.right ) ;
33
34        int arr[] = new int[2] ;
35
36        arr[0] = x[0]+y[0]+root.val ;
37        arr[1] = x[1]+y[1]+1 ;
38
39        if( root.val == (arr[0]/arr[1]) ) cnt++;
40        return arr ;
41    }
42}