// Last updated: 12/10/2026, 11:29:23 pm
1class Solution {
2    public List<List<Integer>> combinationSum3(int k, int n) {
3        List<List<Integer>> res = new ArrayList<>();
4
5        func( n , k , 1, res , new ArrayList<>() , 0);
6
7        return res ;
8    }
9
10    public void func( int n , int k ,int st , List<List<Integer>> res , List<Integer> path , int sum ){
11        if( path.size() > k ) return ; 
12
13        if( path.size() < k && sum == n) return ;
14        
15        if( sum == n   ){
16            res.add( new ArrayList<>(path) );
17            return ;
18        }
19
20        for( int i = st ; i<= 9 ; i++){
21            // if( i> k ) break ;
22
23            path.add( i );
24            func( n , k , i+1 , res , path , sum+i );
25            path.remove( path.size()-1 );
26        }
27    }
28}