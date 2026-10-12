// Last updated: 12/10/2026, 10:48:36 pm
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int low = 1 ;
13        int high = n ;
14
15        while( low<=high ){
16            int mid = low+(high-low)/2 ;
17
18            if( guess(mid)==0 ) return mid ;
19            else if( guess(mid) == 1 ){
20                low = mid+1 ;
21            }
22            else high = mid -  1;
23        }
24        return -1 ;
25    }
26}