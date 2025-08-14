// Last updated: 14/8/2025, 4:25:31 pm
class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(row -> row[0]));
        int count =0;
        int last=1;
        for( int i=0 ; i<meetings.length; i++){
            int start = meetings[i][0], end = meetings[i][1];
            if( start>last){
                count+= (i==0) ? start-last : start-last-1;
                
            }
            last = Math.max(last, end);

        }
        count+= days-last;
        return count;
    }
}