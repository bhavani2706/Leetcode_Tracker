// Last updated: 09/07/2026, 10:01:54
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
    public int getDecimalValue(ListNode head) {
        int index=0;
        ListNode temp=head;
        while(temp!=null){
            index=(index*2)+temp.val;
            temp=temp.next;
        }
        return index;
    }
}