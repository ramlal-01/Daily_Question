// Last updated: 24/8/2026, 12:59:15 am
1class Solution {
2    public int trap(int[] height) {
3        int n= height.length;
4        int lmax= height[0];
5        int rmax = height[n-1];
6        int l=1;
7        int r= n-2;
8        int res =0;
9        while(l<=r){
10            if(lmax<rmax){
11                lmax=Math.max(lmax,height[l]);
12                res = res + lmax-height[l];
13                l++;
14            }
15            else{
16                rmax = Math.max(rmax, height[r]);
17                res = res+ rmax- height[r];
18                r--;
19            }
20        }
21        return res;
22    }
23}