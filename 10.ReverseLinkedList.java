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
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            // 1. Store the next node so we don't lose it
            ListNode nextTemp = current.next; 
            
            // 2. Reverse the link (point it backwards)
            current.next = prev;              
            
            // 3. Slide the pointers forward for the next iteration
            prev = current;                   
            current = nextTemp;               
        }
        
        // 'prev' is now pointing to the new head of the reversed list
        return prev; 
    }
}