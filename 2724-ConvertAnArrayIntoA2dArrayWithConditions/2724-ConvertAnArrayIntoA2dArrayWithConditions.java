// Last updated: 14/8/2025, 4:26:01 pm
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int max=0;
        for(int ele: nums){
            max= Math.max(ele,max);
        }
        int temp[] = new int[max+1];
        for( int i=0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        max=0;
        for(int ele: temp){
            max= Math.max(ele,max);
        }
        List<List<Integer>> res = new ArrayList<>();
        for( int i=0; i<max ; i++){
            ArrayList<Integer> ar = new ArrayList<>();
            for( int j=0; j<temp.length; j++){
                if( temp[j] >= i+1){
                    ar.add(j);
                }
            }
            res.add(ar);
        }
        return res;

    }
}