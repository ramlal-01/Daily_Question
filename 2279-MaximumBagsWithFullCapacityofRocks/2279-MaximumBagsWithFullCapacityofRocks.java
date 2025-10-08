// Last updated: 8/10/2025, 8:21:06 am
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length ; 
        int extra = additionalRocks;
        int need[] = new int[n];

        for( int i = 0 ; i<n ; i++){
            need[i] = capacity[i]-rocks[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i =0 ; i<n ; i++){
            map.put( i , need[i]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> map.get(a) - map.get(b));
        pq.addAll( map.keySet());

        // System.out.println( map);
        //  System.out.println( pq);

        while( !pq.isEmpty()){
            int ind = pq.poll();
            int ele = need[ind];

            if( extra >= ele){
                need[ind] = 0;
                extra -= ele;
            } else {
                break;  
            }
        }
        int c =0 ;
        for( int ele : need){
            if( ele == 0) c++;
        }
        return c;
    }
}