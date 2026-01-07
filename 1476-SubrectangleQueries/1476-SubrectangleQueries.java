// Last updated: 7/1/2026, 7:42:08 am
1class SubrectangleQueries {
2
3    int[][] rect;
4
5    public SubrectangleQueries(int[][] rectangle) {
6        rect = rectangle;
7    }
8
9    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
10        for (int i = row1; i <= row2; i++) {
11            for (int j = col1; j <= col2; j++) {
12                rect[i][j] = newValue;
13            }
14        }
15    }
16
17    public int getValue(int row, int col) {
18        return rect[row][col];
19    }
20}
21
22
23/**
24 * Your SubrectangleQueries object will be instantiated and called as such:
25 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
26 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
27 * int param_2 = obj.getValue(row,col);
28 */