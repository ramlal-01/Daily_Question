// Last updated: 18/10/2025, 11:54:57 pm
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int map[] = new int[101];

        for( int ele : nums){
            map[ele]++;
        }

        int sum =0 ;

        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0 && map[i] % k == 0) {
                sum += i * map[i];
            }
        }

        return sum;
    }
}