// Last updated: 17/8/2025, 9:04:17 am
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list  = new ArrayList<>(); 

        int cnt1=0 , cnt2 =0  , el1= Integer.MIN_VALUE , el2= Integer.MIN_VALUE;

        for( int i =0 ; i<nums.length ; i++){
            if( cnt1==0 && el2!= nums[i]){
                el1 = nums[i];
                cnt1=1;
            }
            else if(cnt2 ==0 && el1!= nums[i]){
                el2 = nums[i];
                cnt2=1;
            }
            else if( el1 == nums[i]){
                cnt1++;
            }
            else if ( el2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                 cnt2--;
            }
        }

        cnt1 = 0 ;
        cnt2 = 0;

        for( int i = 0 ; i< nums.length ; i++){
            if( el1 == nums[i]) cnt1++;
            if( el2 == nums[i]) cnt2++;
        }
        int n = nums.length;
        int mini = (int)(n/3) +1 ;

        if( cnt1 >= mini ) list.add( el1);
        if( cnt2 >= mini ) list.add( el2);
        
        return list;
    }
}