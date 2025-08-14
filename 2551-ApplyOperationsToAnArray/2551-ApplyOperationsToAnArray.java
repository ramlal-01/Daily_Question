// Last updated: 14/8/2025, 4:26:25 pm
class Solution {
    public int[] applyOperations(int[] nums) {
        for( int i=0; i<nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        // return nums;
        ArrayList<Integer> res = new ArrayList<>();
        for(int ele:nums){
            if(ele!=0){
                res.add(ele);
            }
        }
        // System.out.println(res);
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
            
        }
        for(int k=res.size();k<nums.length;k++){
            nums[k]=0;
        }
        return nums;
    }
}