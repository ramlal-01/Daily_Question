// Last updated: 14/8/2025, 4:26:08 pm
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        for( int i=nums.length-1 ; i>=0 ; i--){
            while(nums[i]>0){
                int rem = nums[i]%10;
                res.add(rem);
                nums[i]/=10;
            }
        }
        Collections.reverse(res);
        int arr[] = new int[res.size()];
        int index=0;
        for( int ele : res){
            arr[index++]= ele;

        }
        return arr;
    }
}