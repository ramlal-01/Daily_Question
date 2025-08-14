// Last updated: 14/8/2025, 4:26:52 pm
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> res = new HashSet<>();
        for(int ele: nums){
            res.add(ele);
        }

        while( res.contains(original)){
            original*=2;
        }
        return original; 
    }
}