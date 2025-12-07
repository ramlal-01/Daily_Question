// Last updated: 7/12/2025, 9:24:26 am
1class Solution {
2    public int countOdds(int low, int high) {
3        if((high-low+1)%2==0){
4            return (high-low+1)/2;
5        }
6        else{
7            if( high%2!=0 && low%2!=0 ){
8                return (high-low+1)/2+1 ;
9            }
10            else{
11                return (high-low+1)/2 ;
12            }
13        }
14    }
15}