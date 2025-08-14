// Last updated: 14/8/2025, 4:28:27 pm
class Solution {
    public int maximumCandies(int[] candies, long k) { 
        long low = 1;
        long sum = 0;
        for( int ele: candies){
            sum+= ele;
        } 
        if (sum < k) return 0;
        long high = sum / k;

        while(low<=high){
            long mid= low+(high-low)/2;
            if( distribute( candies, k , mid)){
                low = mid+1;
            }
            else{
                high= mid-1;
            }
        }
        return (int)high;
    } 
    public boolean distribute( int candies[], long people , long allocate){
        long c=0;
        int n=candies.length;
        for(int i=0;i< n; i++ ){
            c= c+ candies[i]/allocate;
        }
        return c>= people;
    }
}