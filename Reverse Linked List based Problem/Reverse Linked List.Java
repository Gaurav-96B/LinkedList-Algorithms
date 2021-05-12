/* TC=>O(N);
SC=>O(1)*/
class Solution {
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

/* TC=>O(N);
SC=>O(1) or O(N) for call stack*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode newHeadNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHeadNode;
        
    }
}
