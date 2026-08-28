// Last updated: 28/8/2026, 11:53:13 pm
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res = new ArrayList<>();
4
5        func( 1 , n , k , res , new ArrayList<>() ) ;
6
7        return res ;
8    }
9
10    public void func( int st , int n , int k , List<List<Integer>> res , List<Integer> path ){
11
12        if( path.size() ==k ){
13            res.add( new ArrayList<>(path) );
14            return ;
15        }
16
17        for( int i = st ; i<=n ; i++ ){
18            path.add( i );
19            func( i+1 , n , k , res , path );
20            path.remove( path.size()-1);
21        }
22    }
23}