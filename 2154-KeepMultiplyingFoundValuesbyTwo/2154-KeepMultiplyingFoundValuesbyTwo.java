// Last updated: 19/11/2025, 6:56:51 pm
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