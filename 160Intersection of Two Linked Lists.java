
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode temp11 = headA;
        ListNode temp22 = headB;
         int len1 =0 , len2=0;
         while(temp11!=null){ 
             temp11=temp11.next;
             len1++;
         }
         while(temp22!=null){ 
             temp22=temp22.next;
             len2++;
         }
         ListNode temp1 = headA;
         ListNode temp2 = headB;
         int l =len2-len1;
         int diff = Math.abs(l);
         if(len1>len2){
             while(diff!=0){
                 temp1=temp1.next;
                 diff--;
             }
             while(temp1!=temp2){
                 temp1=temp1.next;
                 temp2=temp2.next;
             }
             return temp2;
         }
        
         if(len1<=len2){
             while(diff!=0){
                 temp2=temp2.next;
                 diff--;
             }
              while(temp1!=temp2){
                 temp1=temp1.next;
                 temp2=temp2.next;
             }
             return temp1;
         }
	return null;
    }
}
