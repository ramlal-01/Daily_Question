// Last updated: 26/8/2025, 3:23:35 pm
class KthLargest {
    PriorityQueue<Integer> pq ;
    int K;
    public KthLargest(int k, int[] nums) {
        pq  =  new PriorityQueue<>();
        this.K= k;

        for( int i : nums){
            pq.add(i);
        }
    }
    
    public int add(int val) {
        pq.add(val);

        while( pq.size()>K) pq.poll();

        return pq.peek() ; 
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */