// Last updated: 5/3/2026, 7:07:29 pm
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
11    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
12        List<Integer> list = new ArrayList<>() ;
13        if( root==null){
14            return list ;
15        }
16        HashMap<TreeNode,TreeNode> map = new HashMap<>() ;
17        findpar( map , root ) ;
18       
19        Queue<TreeNode> q = new LinkedList<>() ;
20        HashSet<TreeNode> vis = new HashSet<>() ;
21        vis.add( target) ;
22
23        q.add( target );
24        while( !q.isEmpty() ){
25            int size = q.size() ;
26            
27            if( k==0 ) break;
28            
29            for( int i=0 ; i<size ; i++ ){
30                TreeNode curr = q.poll() ;
31                vis.add(curr);
32                if(curr.left!=null && !vis.contains(curr.left) ){
33                    q.add( curr.left);
34                }
35                if(curr.right!=null && !vis.contains(curr.right) ){
36                    q.add( curr.right);
37                }
38                if( map.containsKey(curr) && !vis.contains( map.get(curr ))){
39                    q.add( map.get(curr) );
40                }
41            }
42            k--;
43        }
44
45        while( !q.isEmpty() ){
46            list.add( q.poll().val );
47        }
48        return list;
49    }
50
51    public void findpar( HashMap<TreeNode,TreeNode> map , TreeNode root ){
52        Queue<TreeNode> q = new LinkedList<>() ;
53        q.add( root ) ;
54        while( !q.isEmpty() ){
55            TreeNode node = q.poll() ;
56
57            if( node.left!=null ){
58                map.put( node.left , node ) ;
59                q.add( node.left ) ;
60            }
61            if( node.right!=null ){
62                map.put( node.right , node ) ;
63                q.add( node.right ) ;
64            }
65        }
66    }
67}