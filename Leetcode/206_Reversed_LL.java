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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }else{
            ListNode pre = null;
            ListNode curr = head;
            
            while( curr!= null){
                ListNode forw = curr.next;
                curr.next = pre;
                
                pre = curr;
                curr = forw;
            }
            return pre;
        }
        
    }
}