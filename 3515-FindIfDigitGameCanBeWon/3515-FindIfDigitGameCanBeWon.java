// Last updated: 14/8/2025, 4:25:20 pm
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        int c=0;
        for(int ele:nums){
            if(ele/10==0){
                s+=ele;
            }
            else{
                c+=ele;
            }
        }
        // System.out.println(s);
        //  System.out.println(c);
        
        if( s==c){
            return false;
        }
        return true;
    }
}