// Last updated: 1/3/2026, 12:53:47 am
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13
14        List<TreeNode> lista = new ArrayList<>();
15        List<TreeNode> listb = new ArrayList<>();
16
17        find(root, p, lista);
18        find(root, q, listb);
19
20        TreeNode lca = null;
21
22        for (int i = 0; i < Math.min(lista.size(), listb.size()); i++) {
23            if (lista.get(i) == listb.get(i)) {
24                lca = lista.get(i);
25            } else {
26                break;
27            }
28        }
29
30        return lca;
31    }
32
33    public boolean find(TreeNode root, TreeNode target, List<TreeNode> list) {
34        if (root == null) return false;
35
36        list.add(root);
37
38        if (root == target) return true;
39
40        if (find(root.left, target, list) || find(root.right, target, list)) {
41            return true;
42        }
43
44        list.remove(list.size() - 1);
45        return false;
46    }
47}