// Last updated: 7/10/2025, 6:49:18 am
class Solution {
    public int countArrangement(int n) {
        List<List<Integer>> res = new ArrayList<>();
        boolean arr[] = new boolean[n+1];
        helper( n , res , new ArrayList<>() , arr , 1);
        
        // System.out.println(res);
        return res.size();
    }

    public void helper( int n , List<List<Integer>> res , List<Integer> path, boolean[] arr , int ind ){
        if( path.size()==n){
            res.add( new ArrayList<>(path));
            return ;
        }
        

        for( int i = 1 ; i<=n ; i++){
            if( arr[i]) continue ;

            arr[i] = true ; 

            if( i% ind==0 || ind%i==0 ){
            path.add( i);
            helper( n , res ,path , arr , ind+1);
            path.remove( path.size()-1);
            
            }
            arr[i] = false;
        }
    }
}