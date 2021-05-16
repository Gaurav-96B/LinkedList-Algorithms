/*TC=>O(N)
SC=>O(1)*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(head!=null)
        {
            if(head.next!=null&&head.val==head.next.val)
            {
                while(head.next!=null && head.val==head.next.val)
                {
                    head=head.next;
                }
                prev.next=head.next;
            }
            else
            {
                prev=prev.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}

/*TC=>O(N)
SC=>O(1) or O(N) for call stack*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        if(head.val!=head.next.val)
        {
            head.next=deleteDuplicates(head.next);
            return head;
        }
        ListNode temp=head;
        while(temp!=null&&temp.val==head.val)
        {
            temp=temp.next;
        }
        return deleteDuplicates(temp);
    }
}

