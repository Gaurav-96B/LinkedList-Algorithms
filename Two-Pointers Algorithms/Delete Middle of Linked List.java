class Solution {
    Node deleteMid(Node head) {
         if(head==null)
        {
            return null;
        }
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp1=slow.next;
        temp.next=temp1;
        return head;
    }
} 
