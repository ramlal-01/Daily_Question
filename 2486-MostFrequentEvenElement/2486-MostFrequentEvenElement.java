// Last updated: 14/8/2025, 4:26:34 pm
class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int ele:nums){
            if(max<ele)
                max=ele;
        }
        int map[]= new int[max+1];
        for (int ele : nums) {
            if (ele % 2 == 0) { 
                map[ele]++;
            }
        }
        int ma=-1;
        int ans=-1;
        for(int i=0;i<map.length ; i++){
            if( i%2==0 && ma<map[i] && map[i]>0){
                ma=map[i];
                ans=i;
            }
        }
        
        return ans;
    }
}