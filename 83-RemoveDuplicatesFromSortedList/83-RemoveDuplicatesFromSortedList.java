// Last updated: 09/07/2026, 10:04:24
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
     
    public ListNode deleteDuplicates(ListNode head) {
      int val;
        ListNode next;
        
        if(head==null){
            return null;
        }
        ListNode current=head;
        while(current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
return head;
        
    }
}