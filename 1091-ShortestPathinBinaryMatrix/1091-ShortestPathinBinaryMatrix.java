// Last updated: 17/9/2025, 3:49:39 pm
class Pair {
    int dist;
    int row;
    int col;
    Pair(int d, int r, int c) {
        dist = d;
        row = r;
        col = c;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = m;

        // If start or end is blocked
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;

        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 0, 0)); // Start distance as 1 (not 0)
        dist[0][0] = 1;

        int[] delrow = {-1,-1, 0,1, 1,1,0,-1};
        int[] delcol = { 0, 1,1,1, 0,-1,-1,-1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int dis = p.dist, r = p.row, c = p.col;

            // If we reach destination
            if (r == m-1 && c == n-1) return dis;

            for (int k = 0; k < 8; k++) {
                int nr = r + delrow[k];
                int nc = c + delcol[k];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 0
                        && dis + 1 < dist[nr][nc]) {
                    dist[nr][nc] = dis + 1;
                    q.add(new Pair(dis + 1, nr, nc));
                }
            }
        }

        return -1;
    }
}
