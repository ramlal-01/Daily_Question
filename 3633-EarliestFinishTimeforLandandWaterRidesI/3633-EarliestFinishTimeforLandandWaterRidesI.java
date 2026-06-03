// Last updated: 3/6/2026, 11:12:57 pm
1class Solution {
2    public int minimumCost(int[] cost) {
3        if(cost.length==1) return cost[0];
4        if(cost.length==2) return cost[0]+cost[1];
5        Arrays.sort(cost);
6        int left=0,right=cost.length-1;
7        while(left<right){
8            int temp=cost[left];
9            cost[left]=cost[right];
10            cost[right]=temp;
11            left++;
12            right--;
13        }
14        int ans=0;
15        for(int i=0;i<cost.length;i++){
16            if((i+1)%3==0) continue;
17            ans+=cost[i];
18        }
19        return ans;
20    }
21}