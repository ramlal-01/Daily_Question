// Last updated: 1/3/2026, 12:17:08 am
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
23        
24        q.add(root);
25        
26        while(!q.isEmpty()){
27            int len = q.size();
28            List<Integer> level = new ArrayList<>();
29
30            for( int i = 1 ; i<=len ; i++){
31                TreeNode n = q.poll(); 
32                level.add(n.val);
33                
34                if( n.left!=null) q.add(n.left);
35                if( n.right!= null) q.add(n.right);
36            }
37
38            ans.add( level.get(level.size()-1));
39             
40        }
41        return ans ;
42    }
43}