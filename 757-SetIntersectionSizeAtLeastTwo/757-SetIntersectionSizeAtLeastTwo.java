// Last updated: 20/11/2025, 1:32:08 pm
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return b[0] - a[0];
        });

        int p1 = -1;      
        int p2 = -1;      
        int count = 0;

        for (int[] in : intervals) {
            int L = in[0], R = in[1];

            boolean insideP1 = (p1 >= L);
            boolean insideP2 = (p2 >= L);

            if (insideP1 && insideP2) {
                continue;
            }
            
            if (insideP2) {
                count++;
                p1 = p2;
                p2 = R;
                continue;
            }

            count += 2;
            p1 = R - 1;
            p2 = R;

        }

        return count;
    }
}
