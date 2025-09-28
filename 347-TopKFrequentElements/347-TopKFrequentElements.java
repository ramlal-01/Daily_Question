// Last updated: 28/9/2025, 12:01:14 pm
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int ele : nums){
            map.put( ele , map.getOrDefault(ele,0)+1 );
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> map.get(b)- map.get(a));

        pq.addAll( map.keySet());

        ArrayList<Integer> list = new ArrayList<>();
        while( k-->0){
            int n = pq.poll();
            list.add(n);
        }
        int arr[] = new int[list.size()];
        int i = 0 ;
        for( int ele : list ){
            arr[i++] = ele ;
        }
        return arr ;
    }
}