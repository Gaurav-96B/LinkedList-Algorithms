/*TC=>O(max(n1,n2))
SC=>O(N)*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversel1=reverseList(l1);
        ListNode reversel2=reverseList(l2);
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int carry=0;
        while(reversel1!=null||reversel2!=null||carry==1)
        {
            int sum=0;
            if(reversel1!=null)
            {
                sum=sum+reversel1.val;
                reversel1=reversel1.next;
            }
            if(reversel2!=null)
            {
                sum=sum+reversel2.val;
                reversel2=reversel2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return reverseList(dummy.next);
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
        
    }
}
