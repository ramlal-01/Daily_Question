// Last updated: 14/8/2025, 4:25:41 pm
class Solution {
    public int minOperations(int[] nums, int k) {
        int res= xor(nums);
        if(res ==k) return 0;
        
        int s=0;
        int num=res^k;
        while( num>0){
            int rem= num%2;
            if( rem==1) s++;
            num/=2;
        }
        return s;
    }

    
    public int xor( int[] arr){
        int f=0;
        for( int ele: arr){
            f=f^ele;
        }
        return f;
    }
}