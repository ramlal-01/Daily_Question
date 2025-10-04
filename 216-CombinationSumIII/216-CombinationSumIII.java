// Last updated: 4/10/2025, 3:12:40 pm
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        func( n , k , 1, res , new ArrayList<>() , 0);

        return res ;
    }

    public void func( int n , int k ,int st , List<List<Integer>> res , List<Integer> path , int sum ){
        if( path.size() > k ) return ; 

        if( path.size() < k && sum == n) return ;
        if( sum == n   ){
            res.add( new ArrayList<>(path) );
            return ;
        }

        for( int i = st ; i<= 9 ; i++){
            // if( i> k ) break ;

            path.add( i );
            func( n , k , i+1 , res , path , sum+i );
            path.remove( path.size()-1 );
        }
    }
}