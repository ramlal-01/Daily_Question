// Last updated: 14/8/2025, 4:27:17 pm
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n= nums.length;
        HashSet<Integer> set = new HashSet<>();
        for( int i=0; i<n ; i++){
            int num=0;
            int k=n-1;
            for( int j=0; j<n ; j++){
                num+= Math.pow(2,k) * (nums[i].charAt(j)-'0');
                k--;
            }
            set.add(num);
            
        }
        // System.out.println(set);
        
        int res=0;
        for( int i=0; i<= Math.pow(2,n)-1 ; i++){
            if( !set.contains(i)){
                res=i;
                break;
            }
        }

        // System.out.println( res);
        StringBuilder s = new StringBuilder();
        // int count = n;  
        while (n > 0) {
            int rem = res % 2;
            s.append(rem);
            res = res / 2;
            n--;
        }
        return s.reverse().toString(); 
    }
}