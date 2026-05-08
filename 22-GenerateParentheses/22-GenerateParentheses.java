// Last updated: 9/5/2026, 12:10:03 am
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4
5        func( "" , n ,res , 0 , 0 );
6
7        return res ;
8    }
9
10    public void func( String curr , int n ,List<String> res , int open , int close){
11        if( curr.length()==2*n){
12            res.add(curr);
13            return ;
14        }
15
16        if( open<n){
17            func( curr+"(" , n , res , open+1 , close);
18        }
19        if( close<open){
20            func( curr+ ")" , n , res , open , close+1);
21        }
22    }
23}