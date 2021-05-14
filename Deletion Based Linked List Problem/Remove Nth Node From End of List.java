/* TC=>O(N) or one pass
SC=>O(1)*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}

/* TC=>O(N+N)=>O(2N) or two pass
SC=>O(1)*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        int traverse=size-n;
        if(traverse==0)
        {
            ListNode node=head;
            head=head.next;
            return head;
        }
        ListNode temp1=head;
        int count=1;
        while(count!=traverse)
        {
            temp1=temp1.next;
            count++;
        }
        ListNode node=temp1.next;
        temp1.next=temp1.next.next;
        return head;
        
    }
}
