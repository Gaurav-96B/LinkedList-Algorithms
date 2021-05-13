/*TC=>O(K*N)
SC=>O(1)*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        k=k%size;
        for(int i=0;i<k;i++)
        {
        ListNode prev=head;
          ListNode temp1=head.next;
            while(temp1.next!=null)
            {
                prev=prev.next;
                temp1=temp1.next;
            }
            temp1.next=head;
            prev.next=null;
            head=temp1;
        }
        return head;
        
    }
}

/*TC=>O(N)+O(N-(N%k))=O(N)
SC=>O(1)*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        ListNode temp=head;
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        temp.next=head;
        k=k%size;
        k=size-k;
        while(k-->0)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        
        return head;
    }
}
