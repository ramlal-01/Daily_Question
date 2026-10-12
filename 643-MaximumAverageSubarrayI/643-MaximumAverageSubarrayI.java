// Last updated: 12/10/2026, 1:54:12 pm
1
2class Solution {
3    public double findMaxAverage(int[] nums, int k) {
4        int n = nums.length;
5        int sum = 0;
6
7        for (int i = 0; i < k; i++) {
8            sum += nums[i];
9        }
10
11        int maxi = sum;
12
13        for (int i = k; i < n; i++) {
14            sum += nums[i];
15            sum -= nums[i - k];
16
17            maxi = Math.max(maxi, sum);
18        }
19
20        return (double) maxi / k;
21    }
22}
23