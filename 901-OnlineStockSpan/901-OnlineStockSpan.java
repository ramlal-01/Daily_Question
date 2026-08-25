// Last updated: 25/8/2026, 9:46:22 pm
1class StockSpanner {
2
3    private Stack<int[]> stack;
4
5    public StockSpanner() {
6        this.stack = new Stack<>();
7    }
8
9    public int next(int price) {
10        int span = 1; 
11
12        while (!stack.isEmpty() && stack.peek()[0] <= price) {
13            span += stack.pop()[1];
14        }
15
16        stack.push(new int[]{price, span}); 
17        return span;
18    }
19}
20
21/**
22 * Your StockSpanner object will be instantiated and called as such:
23 * StockSpanner obj = new StockSpanner();
24 * int param_1 = obj.next(price);
25 */