// Last updated: 14/8/2025, 4:28:08 pm
class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for( int i=1; i<= n ; i++){
            if( n%i==0 ){
                res.add(i);
            }
        }
        // System.out.print(res);
        if( k> res.size()){
            return -1;
        }
        return res.get(k-1);
    }
}