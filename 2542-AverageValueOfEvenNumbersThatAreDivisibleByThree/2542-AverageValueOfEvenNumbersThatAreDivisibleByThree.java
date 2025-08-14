// Last updated: 14/8/2025, 4:26:26 pm
class Solution {
    public int averageValue(int[] nums) {
        // ArrayList<Integer> res = new ArrayList<>();
        int s=0;
        int f=0;
        for(int ele: nums){
            if(ele%6==0){
                s+=ele;
                f++;
            }
        }
        if(f==0) return 0;
        return (int)s/f;
        
    }
}