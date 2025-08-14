// Last updated: 14/8/2025, 4:25:46 pm
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
    	for (int i = 0; i < nums.size(); i++)
        	if (Integer.bitCount(i) == k)
        		sum += nums.get(i);
        return sum;
    }
}