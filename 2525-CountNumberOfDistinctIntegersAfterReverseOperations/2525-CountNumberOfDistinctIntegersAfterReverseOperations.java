// Last updated: 14/8/2025, 4:26:28 pm
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> temp= new HashSet<>();
        for( int ele : nums){
            temp.add(ele);
            temp.add(reverse(ele));
        }
        return temp.size();
    }
    public int reverse( int a){
        int i=0;
        while( a>0){
            int rem = a%10;
            i= i*10+rem;
            a/=10;
        }
        return i;
    }
}