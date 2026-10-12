// Last updated: 12/10/2026, 5:55:42 pm
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
16
17class Solution {
18    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
19        List<Integer> list1 = new ArrayList<>();
20        List<Integer> list2 = new ArrayList<>();
21
22        getLeaves(root1, list1);
23        getLeaves(root2, list2);
24
25        return list1.equals(list2);
26    }
27
28    private void getLeaves(TreeNode root, List<Integer> list) {
29        if (root == null) {
30            return;
31        }
32
33        if (root.left == null && root.right == null) {
34            list.add(root.val);
35            return;
36        }
37
38        getLeaves(root.left, list);
39        getLeaves(root.right, list);
40    }
41}
42