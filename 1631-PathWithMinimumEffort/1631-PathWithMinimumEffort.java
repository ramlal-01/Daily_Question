// Last updated: 17/9/2025, 4:24:05 pm
class Pair {
    int dif;
    int row;
    int col;
    Pair(int d, int r, int c) {
        dif = d;
        row = r;
        col = c;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
 
        int[][] diff = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(diff[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> q = new PriorityQueue<>( (a,b)->a.dif-b.dif);
        q.add(new Pair(0, 0, 0));  

        diff[0][0] = 0;

        int[] delrow = {-1,0,1,0};
        int[] delcol = { 0, 1, 0,-1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int difference = p.dif, r = p.row, c = p.col;
 
            if (r == m-1 && c == n-1) return difference;

            for (int k = 0; k < 4; k++) {
                int nr = r + delrow[k];
                int nc = c + delcol[k];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n ) {
                     
                    int newdif = Math.max( Math.abs( heights[r][c]-heights[nr][nc]) , difference );

                    if( newdif< diff[nr][nc]){
                        diff[nr][nc] = newdif;
                        q.add(new Pair( newdif , nr, nc));
                    }
                    
                }
            }
        }

        return 0;
    }
}