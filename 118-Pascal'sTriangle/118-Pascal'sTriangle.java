// Last updated: 16/8/2025, 11:34:56 pm
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for( int i=1 ; i<= numRows ; i++){
            list.add( pascal( i));
        }
        return list ; 
    }

    public List<Integer> pascal( int rows ){
        long ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);

        for( int col = 1; col < rows ; col++){
            ans = ans* ( rows -col );
            ans = ans/ ( col );
            temp.add( (int) ans);
        }
        return temp ;
    }
}