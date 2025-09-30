// Last updated: 30/9/2025, 12:42:34 pm
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length ;
        for( int i =0 ; i< k ; i++){
            while( !dq.isEmpty() && nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for( int i= k ; i<n ; i++){
            list.add( nums[dq.peekFirst()] );

            while( !dq.isEmpty() && dq.peekFirst()<=i-k ){
                dq.pollFirst();
            }

            while( !dq.isEmpty() && nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

        }

        list.add( nums[dq.peekFirst()] );

        int arr[] = new int[list.size() ];
        for( int i= 0 ;i<arr.length ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}