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
    ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next=null;
        while(current!=null){ 
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
         ListNode second = reverseList(slow.next);
        slow.next = null;
                ListNode first = head;
      
          while (first != null && second != null) {
          ListNode temp1 = first.next;
          first.next = second;
          ListNode temp2 = second.next;
          second.next = temp1;
         first = temp1;
         second = temp2;
             

        }
        if (first != null) 
        {
            first.next = null;
        }
        }
}
