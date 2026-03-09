// Last updated: 9/3/2026, 4:17:34 pm
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int num : nums){
7            set.add(num);
8        }
9
10        int longest = 0;
11
12        for(int num : set){
13
14            if(!set.contains(num - 1)){    
15
16                int curr = num;
17                int length = 1;
18
19                while(set.contains(curr + 1)){
20                    curr++;
21                    length++;
22                }
23
24                longest = Math.max(longest, length);
25            }
26        }
27
28        return longest;
29    }
30}