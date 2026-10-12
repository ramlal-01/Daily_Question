// Last updated: 12/10/2026, 11:26:57 am
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int count= 0;
4 
5            for( int i=0 ; i< flowerbed.length  ;i++){
6                if(flowerbed[i] == 0){
7
8                    boolean left = (i == 0) || (flowerbed[i-1] == 0);
9boolean right = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);
10
11                
12
13                if( left && right){
14                    count++;
15                    flowerbed[i]=1;
16                }
17                }
18                if( count>=n) return true;
19            }
20        
21
22        if( count<n) return false ;
23        return true;
24    }
25}