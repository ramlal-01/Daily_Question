// Last updated: 14/8/2025, 4:28:46 pm
class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        int f=0;
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                f++;
            }
        }
        return f;
    }
}