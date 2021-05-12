/*TC=>O(N)
SC=>O(1)*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else
            {
            temp=temp.next;
            }
        }
        return head;
        
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
        ListNode temp=head;
        if(temp.val==temp.next.val)
        {
            temp.next=temp.next.next;
            deleteDuplicates(head);
        }
        else
        {
           deleteDuplicates(head.next);
        }
        return head;
        
    }
}
