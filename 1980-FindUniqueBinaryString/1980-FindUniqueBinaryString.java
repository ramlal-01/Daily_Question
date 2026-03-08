// Last updated: 8/3/2026, 10:29:39 pm
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        int n= nums.length;
4        HashSet<Integer> set = new HashSet<>();
5        for( int i=0; i<n ; i++){
6            int num=0;
7            int k=n-1;
8            for( int j=0; j<n ; j++){
9                num+= Math.pow(2,k) * (nums[i].charAt(j)-'0');
10                k--;
11            }
12            set.add(num);
13            
14        }
15        System.out.println(set);
16        
17        int res=0;
18        for( int i=0; i<= Math.pow(2,n)-1 ; i++){
19            if( !set.contains(i)){
20                res=i;
21                break;
22            }
23        }
24
25        System.out.println( res);
26        StringBuilder s = new StringBuilder();
27        int count = n;  
28        while (count > 0) {
29            int rem = res % 2;
30            s.append(rem);
31            res = res / 2;
32            count--;
33        }
34        return s.reverse().toString(); 
35    }
36}