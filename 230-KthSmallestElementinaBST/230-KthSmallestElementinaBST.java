// Last updated: 13/3/2026, 11:58:30 am
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
17    List<Integer> list;
18    public int kthSmallest(TreeNode root, int k) {
19        list = new ArrayList<>() ;
20        helper( root ) ;
21        //System.out.println( list ) ;
22        return list.get(k-1) ;
23    }
24
25    public void helper( TreeNode root ){
26        if( root==null ) return ;
27
28        helper( root.left );
29        list.add(root.val) ;
30        helper( root.right ) ;
31    }
32}