// Last updated: 23/12/2025, 4:34:52 pm
1class Solution{
2    public int numWays(String s){
3        int n=s.length() ; 
4        int sum=0;
5        int mod = (int)1e9+7 ;
6        for(int i=0;i<n;i++) if(s.charAt(i)=='1') sum++;
7
8        if(sum%3!=0) return 0;
9        
10        if(sum==0){
11            long x=n-1;
12            return (int)(x*(x-1)/2%mod);
13        }
14
15        int need=sum/3;
16        int c=0;
17
18        long a=0,b=0;
19
20        for(int i=0;i<n;i++){
21            if(s.charAt(i)=='1') c++;
22            if(c==need) a++;
23            else if(c==2*need) b++;
24        }
25        
26        return (int)(a*b%mod);
27    }
28}
29