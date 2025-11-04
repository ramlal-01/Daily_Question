// Last updated: 4/11/2025, 2:55:34 pm
class Solution { 
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ; 
        List<Integer> tails = new ArrayList<>();

        for( int num : nums){
            int i = Collections.binarySearch( tails , num);

            if( i<0 ) i = -(i+1);

            if( i== tails.size() ){
                tails.add(num);
            } else{
                tails.set( i , num ); 
            }
        }
        return tails.size();
    }
}