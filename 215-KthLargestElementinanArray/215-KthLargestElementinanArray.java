// Last updated: 16/4/2026, 2:59:21 pm
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for( int i=0 ; i<nums.length ; i++){
5            pq.add( nums[i]);
6            if( pq.size()>k){
7                pq.poll();
8            }
9        }
10
11        return pq.poll() ; 
12    }
13}