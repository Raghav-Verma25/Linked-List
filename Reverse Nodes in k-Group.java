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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        ListNode prev = dummy;
        ListNode curr=head;
        ListNode nxt =null;
        int len =0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        while(len >=k){
            curr=prev.next;
            nxt=curr.next;
            for(int i =1 ; i<k ; i++){
                curr.next = nxt.next;
                nxt.next=prev.next;
                prev.next = nxt;
                nxt = curr.next;
            }
            prev = curr;
            len = len - k;
            
        }
        
        return dummy.next;
        
    }
}







