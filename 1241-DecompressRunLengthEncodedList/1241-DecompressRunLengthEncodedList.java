// Last updated: 14/8/2025, 4:28:37 pm
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for( int i=0; i<nums.length; i=i+2){
            for( int j=0; j<nums[i] ; j++){
                res.add(nums[i+1]);
            }
        }
        int arr[] = new int[res.size()];
        for( int i=0 ; i<res.size() ; i++){
            arr[i]= res.get(i);
        }
        return arr;
    }
}