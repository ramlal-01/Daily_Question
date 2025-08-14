// Last updated: 14/8/2025, 4:28:49 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val); 
            temp = temp.next;
        }
        int n = arr.size();
        int res[]= new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for( int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr.get(i)>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]= stack.peek();
            }
            stack.push(arr.get(i));
        }
        return res;
    }
}