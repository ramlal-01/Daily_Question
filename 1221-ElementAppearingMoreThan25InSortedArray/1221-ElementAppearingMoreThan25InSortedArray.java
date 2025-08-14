// Last updated: 14/8/2025, 4:28:40 pm
class Solution {
    public int findSpecialInteger(int[] arr) {
        int i;
        for( i=0; i<arr.length ; i++){
            if( arr[i]== arr[i+arr.length/4]){
                return arr[i];
            }
        }
        return arr[i];
    }
}