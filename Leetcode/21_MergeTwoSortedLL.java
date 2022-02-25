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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1==null? list2 : list1;
        }
        
        ListNode head = new ListNode(-1);
        ListNode pre = head;
        
        ListNode one = list1;
        ListNode two = list2;
        
        while(one != null && two != null){
            if(one.val < two.val){
                pre.next = one;
                pre = one;
                one = one.next;
                
            }else{
                pre.next = two;
                pre = two;
                two = two.next;
                
            }
        }
        if(one != null){
            pre.next = one;
        }
        if(two != null){
           pre.next = two;
        }
        return head.next;
    }
}