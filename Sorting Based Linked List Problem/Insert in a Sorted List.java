class Solution {
    Node sortedInsert(Node head1, int key) 
    {
      if(head1==null)
        {
            return null;
        }
        Node prev=head1;
        Node temp=prev.next;
        int z=1;
        int found=0;
        while(temp!=null)
        {
            if(prev.data>key)
            {
                found=1;
                break;
            }
            if(temp.data>key)
            {
                break;
            }
            temp=temp.next;
            prev=prev.next;
        }
        Node n=new Node(key);
        if(found==1)
        {
            n.next=prev;
            head1=n;
        }
        else
        {
        n.next=temp;
        prev.next=n;
        }
        return head1;  
    }
}
