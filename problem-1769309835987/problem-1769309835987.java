// Last updated: 25/1/2026, 8:27:15 am
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        List<Integer> list = new ArrayList<>();
4        for( int ele : nums){
5            if( ele>=0){
6                list.add(ele);
7            }
8        }
9        if( list.size()==0) return nums;
10    
11        int n = list.size();
12        k = k%n ;
13
14        
15        reverse(list  , 0 , k-1);
16        reverse( list , k , n-1);
17        reverse( list , 0 , n-1 );
18
19        int a = 0 ;
20
21        for( int i =0 ; i<nums.length ; i++){
22            if( nums[i]>=0){
23                nums[i]=list.get(a++);
24            }
25            
26        }
27        return nums;
28    }
29
30    public void reverse( List<Integer> arr  , int left , int right ){
31        while( left<right){
32            int temp = arr.get(left);
33            arr.set(left , arr.get(right));
34            arr.set(right,temp);
35            left++;
36            right--;
37        }
38        return;
39    }
40}