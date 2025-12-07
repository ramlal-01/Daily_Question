// Last updated: 7/12/2025, 8:15:31 am
1class Solution {
2    public int[] sortByReflection(int[] nums) {
3        int n = nums.length ;
4        int arr[][] = new int[n][2];
5
6        int i = 0 ;
7        for( int ele : nums){
8            
9            String s = Integer.toBinaryString(ele);
10            String s2 = new StringBuilder(s).reverse().toString();
11            int no = Integer.parseInt(s2,2);
12
13            arr[i][0] = ele ;
14            arr[i][1] = no ;
15            i++;
16        }
17
18        Arrays.sort( arr , (a,b)-> {
19            if( a[1]!= b[1] ) return a[1]-b[1];
20            return a[0]-b[0];
21        });
22
23        int k =0 ;
24        for( int ele[] : arr ){
25            nums[k++] = ele[0];
26        }
27        return nums;
28    }
29}