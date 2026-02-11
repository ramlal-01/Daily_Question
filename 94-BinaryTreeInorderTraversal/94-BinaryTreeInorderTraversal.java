// Last updated: 11/2/2026, 2:43:54 pm
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> list = new ArrayList<>() ;
19        helper( root , list );
20        return list ;
21    }
22
23    public void helper( TreeNode root , List<Integer> list ){
24        if( root == null ){
25            return ;
26        }
27
28        helper( root.left , list );
29        list.add( root.val ) ;
30        helper( root.right , list );
31    }
32}