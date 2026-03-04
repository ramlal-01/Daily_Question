// Last updated: 5/3/2026, 12:33:06 am
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
16class Pair{
17    TreeNode node;
18    int ind ;
19
20    Pair( TreeNode r , int n){
21        node = r;
22        ind = n;
23    }
24}
25class Solution {
26    public int widthOfBinaryTree(TreeNode root) {
27        if( root == null ) return 0 ;
28        Queue<Pair> q = new LinkedList<>() ;
29        q.add( new Pair(root,0));
30
31        int ans = 0 ;
32        while( !q.isEmpty()){
33            int size= q.size();
34            int mini = q.peek().ind ;
35            int first = 0 , last = 0 ;
36            for( int i =0 ; i<size ; i++ ){
37                int curr = q.peek().ind - mini ;
38                TreeNode currnode = q.peek().node ;
39                q.poll() ;
40
41                if( i==0) first = curr ;
42                if( i==size-1) last = curr ;
43
44                if( currnode.left!=null ) q.add( new Pair(currnode.left,2*curr+1));
45                if( currnode.right!=null ) q.add( new Pair(currnode.right,2*curr+2));
46                
47            }
48            ans = Math.max( ans , last-first +1 );
49        }
50        return ans ;
51    }
52}