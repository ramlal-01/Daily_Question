// Last updated: 1/10/2026, 10:19:15 am
1class Solution {
2    public boolean isValid(String s) {
3        if(s.length()==1)return false;
4        stack st = new stack(s.length());
5        for( int i=0 ; i<s.length() ; i++){
6            if( s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
7                st.push(s.charAt(i));
8            }
9            else{
10                if( st.isEmpty()){
11                    return false;
12                }
13                char p = st.pop();
14                if( (s.charAt(i)==')' && p!='(' ) || (s.charAt(i)=='}' && p!='{' ) || (s.charAt(i)==']' && p!='[' ) ) 
15                    {
16                        return false;
17                    }
18            }
19        }
20        return st.isEmpty();
21    }
22}
23
24
25
26class stack{
27    Character arr[];
28    int top;
29    
30    public stack( int size){
31        arr = new Character[size];
32        top =-1;
33    }
34    
35    public void push(char data){
36        if(isFull()){
37            return ;
38        }
39        top++;
40        arr[top]=data;
41    }
42    public boolean isFull(){
43        if( top==arr.length-1){
44            return true;
45        }
46        return false;
47    }
48    public char pop(){
49        // if( isEmpty()){
50        //     return -1;
51        // }
52        char p= arr[top];
53        top--;
54        return p;
55    }
56    public boolean isEmpty(){
57        return top==-1;
58    }
59}