// Last updated: 28/10/2025, 6:10:18 am
class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        int max = Integer.MIN_VALUE ;

        for( int i = 0 ; i<heights.length ; i++){
            while( !st.isEmpty() && heights[st.peek()]>heights[i] ){
                int ele = heights[st.pop()];
                int nse = i ;
                int pse = st.isEmpty() ? -1 : st.peek();

                max = Math.max( max , ele* (nse - pse -1) );
            }
            st.push(i);
        }

        while( !st.isEmpty() ){
            int nse = heights.length ;
            int ele = heights[st.pop()];
            int pse = st.isEmpty() ? -1 : st.peek();

            max = Math.max( max , ele* (nse - pse -1) );
        }
        return max ;
    }
}