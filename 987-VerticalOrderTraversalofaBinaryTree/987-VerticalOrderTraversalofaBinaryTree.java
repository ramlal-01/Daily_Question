// Last updated: 1/3/2026, 12:03:30 am
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
16class Tuple{
17    TreeNode node ;
18    int row ;
19    int col ;
20    Tuple( TreeNode node , int row , int col){
21        this.node = node ;
22        this.row = row ;
23        this.col = col ;
24    }
25}
26class Solution {
27    public List<List<Integer>> verticalTraversal(TreeNode root) {
28        TreeMap< Integer, TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>() ;
29
30        Queue<Tuple> q = new LinkedList<>() ;
31        q.add( new Tuple(root , 0 , 0 ));
32        while( !q.isEmpty() ){
33            Tuple tuple = q.poll() ;
34            TreeNode node = tuple.node ;
35            int x = tuple.row ;
36            int y = tuple.col ;
37
38            if( !map.containsKey(x)){
39                map.put( x, new TreeMap<>());
40            }
41            if( !map.get(x).containsKey(y)){
42                map.get(x).put( y , new PriorityQueue<>());
43            }
44            map.get(x).get(y).add(node.val);
45            if( node.left!=null ){
46                q.add( new Tuple( node.left , x-1 , y+1 ));
47            }
48            if( node.right!=null ){
49                q.add( new Tuple( node.right , x+1 , y+1 ));
50            }
51        }
52
53        List<List<Integer>> list = new ArrayList<>() ;
54        for( TreeMap<Integer,PriorityQueue<Integer>> ele : map.values()){
55            list.add( new ArrayList<>()) ;
56            for(  PriorityQueue<Integer> curr : ele.values() ){
57                while( !curr.isEmpty()){
58                    list.get( list.size()-1).add( curr.poll());
59                }
60            }
61        }
62        // System.out.println( map );
63        return list ;
64    }
65}