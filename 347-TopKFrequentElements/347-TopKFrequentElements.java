// Last updated: 28/9/2025, 12:04:25 pm
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int ele : nums){
            map.put( ele , map.getOrDefault(ele,0)+1 );
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> map.get(a)- map.get(b));

        for (int num : map.keySet()) {
            pq.offer(num);
            if (pq.size() > k) pq.poll();  
        }

        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll();
        }
        return res;
    }
}