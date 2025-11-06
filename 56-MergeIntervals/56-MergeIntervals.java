// Last updated: 6/11/2025, 2:34:16 pm
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort( intervals , (a,b) -> Integer.compare( a[0] ,b[0] ));

        List<int[]> list = new ArrayList<>();

        int a = intervals[0][0] ;
        int b=  intervals[0][1] ;

        for( int i = 0 ; i<intervals.length ; i++){
            if( intervals[i][0] <= b ){
                a = Math.min( a , intervals[i][0] );
                b = Math.max( b , intervals[i][1] );
            }
            else{
                list.add(new int[]{a,b} );
                a = intervals[i][0];
                b = intervals[i][1];
            }

        }
        list.add(new int[]{a, b});
        return list.toArray(new int[list.size()][]);
    }
}