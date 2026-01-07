// Last updated: 7/1/2026, 7:45:01 am
1class SubrectangleQueries {
2
3    int[][] rect;
4    List<int[]> updates;
5
6    public SubrectangleQueries(int[][] rectangle) {
7        rect = rectangle;
8        updates = new ArrayList<>();
9    }
10
11    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
12        updates.add(new int[]{row1, col1, row2, col2, newValue});
13    }
14
15    public int getValue(int row, int col) {
16        for (int i = updates.size() - 1; i >= 0; i--) {
17            int[] u = updates.get(i);
18            if (row >= u[0] && row <= u[2] && col >= u[1] && col <= u[3]) {
19                return u[4];
20            }
21        }
22        return rect[row][col];
23    }
24}
25
26
27
28/**
29 * Your SubrectangleQueries object will be instantiated and called as such:
30 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
31 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
32 * int param_2 = obj.getValue(row,col);
33 */