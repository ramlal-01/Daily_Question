// Last updated: 14/8/2025, 4:25:48 pm
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int f=0;
        for( int i=0; i<nums.size() ; i++){
            for( int j=i+1; j<nums.size(); j++){
                if( (nums.get(i)+nums.get(j) ) < target){
                    f++;
                }
                // System.out.println("("+nums.get(i)+","+nums.get(j)+")");
            }
        }
        return f;
    }
}