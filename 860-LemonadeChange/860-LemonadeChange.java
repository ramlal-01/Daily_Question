// Last updated: 21/3/2026, 1:54:46 pm
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int arr[] = new int[3] ;
4
5        for ( int i = 0 ; i< bills.length ; i++){
6
7            if( bills[i]==5){
8                arr[0]++;
9            }
10            else if( bills[i]==10){
11                arr[1]++;
12                if( arr[0]<1) return false ;
13                else arr[0]--;
14            }
15            else{
16                arr[2]++;
17                if( (arr[1]>=1 && arr[0]>=1) ){
18                    arr[0]--;
19                    arr[1]-- ;
20                }
21                else if ( arr[0]>=3 ){
22                    arr[0] -= 3 ;
23                }
24
25                else return false ;
26            }
27        }
28        return true ;
29    }
30}