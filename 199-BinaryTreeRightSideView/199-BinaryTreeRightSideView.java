// Last updated: 12/3/2026, 4:06:45 pm
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19        if(root==null){
20            return ans;
21        }
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24        while(!q.isEmpty()){
25            int len = q.size();
26            List<Integer> level = new ArrayList<>();
27
28            for( int i = 1 ; i<=len ; i++){
29                TreeNode n = q.poll(); 
30                level.add(n.val);
31                
32                if( n.left!=null) q.add(n.left);
33                if( n.right!= null) q.add(n.right);
34            }
35
36            ans.add( level.get(level.size()-1));
37             
38        }
39        return ans ;
40    }
41}