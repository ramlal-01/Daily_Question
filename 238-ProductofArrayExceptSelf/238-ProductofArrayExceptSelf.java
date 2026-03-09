// Last updated: 9/3/2026, 4:21:48 pm
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length ;
4        int pre[] = new int[n];
5        int post[]= new int[n];
6        pre[0]=1;
7        post[nums.length-1]=1;
8        for( int i=1; i<nums.length; i++){
9            pre[i]= pre[i-1]*nums[i-1];
10        }
11        for( int i=nums.length-2; i>=0; i--){
12            post[i]= post[i+1]*nums[i+1];
13        }
14        // System.out.println( Arrays.toString(pre) );
15        // System.out.println( Arrays.toString(post) );
16        for( int i=0; i<nums.length ; i++){
17            nums[i]= pre[i]*post[i];
18        }
19        return nums;
20    }
21}