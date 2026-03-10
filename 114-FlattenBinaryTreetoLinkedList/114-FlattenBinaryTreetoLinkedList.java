// Last updated: 10/3/2026, 12:15:04 pm
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
17    List<TreeNode> list = new ArrayList<>() ;
18    public void flatten(TreeNode root) {
19        helper( root );
20        for(int i = 0; i<list.size() - 1; i++){
21            TreeNode curr = list.get(i);
22            TreeNode next = list.get(i+1);
23            curr.left = null;
24            curr.right = next;
25        }
26    }
27
28    public void helper( TreeNode root ){
29        if( root==null ){
30            return  ;
31        }
32        list.add(root);
33        helper(root.left);
34        helper(root.right);
35    }
36}