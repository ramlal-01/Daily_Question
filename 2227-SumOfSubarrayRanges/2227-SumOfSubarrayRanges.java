// Last updated: 14/8/2025, 4:27:06 pm
class Solution {
    public long subArrayRanges(int[] nums) {
        int nse[] = nse(nums);
        int pse[] = pse(nums);
        int nge[] = nge(nums);
        int pge[] = pge(nums);

        long minsum = 0 ;
        long maxsum = 0;

        int n = nums.length;
        for( int i=0 ; i<n ; i++){
            int ns = nse[i]-i;
            int ps = i - pse[i];
            minsum = minsum+ ( ns * ps * (long)nums[i]);

            ns = nge[i]-i;
            ps = i - pge[i];
            maxsum = maxsum+ ( ns * ps * (long)nums[i]);
        }

        return maxsum - minsum;

    }

    public int[] nse(int[] arr){
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int res[] = new int[n];
        for( int i=n-1 ; i>=0 ; i--){
            while( !st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            if( st.isEmpty()){
                res[i]=n;
            }
            else{
                res[i]= st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int[] pse(int[] arr){
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int res[] = new int[n];
        for( int i=0 ; i<n ; i++){
            while( !st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            if( st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]= st.peek();
            }
            st.push(i);
        }
        return res;
    }

    public int[] nge(int[] arr){
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int res[] = new int[n];
        for( int i=n-1 ; i>=0 ; i--){
            while( !st.isEmpty() && arr[st.peek()]< arr[i]){
                st.pop();
            }
            if( st.isEmpty()){
                res[i]=n;
            }
            else{
                res[i]= st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int[] pge(int[] arr){
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int res[] = new int[n];
        for( int i=0 ; i<n ; i++){
            while( !st.isEmpty() && arr[st.peek()]<= arr[i]){
                st.pop();
            }
            if( st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]= st.peek();
            }
            st.push(i);
        }
        return res;
    }
}