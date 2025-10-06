// Last updated: 6/10/2025, 8:24:14 am
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        func( "" , n ,res , 0 , 0 );

        return res ;
    }

    public void func( String curr , int n ,List<String> res , int open , int close){
        if( curr.length()==2*n){
            res.add(curr);
            return ;
        }

        if( open<n){
            func( curr+"(" , n , res , open+1 , close);
        }
        if( close<open){
            func( curr+ ")" , n , res , open , close+1);
        }
    }
}