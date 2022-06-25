Node deleteNode(Node head, int x)
    {
        if(head==null)
        {
            return head;
        }
        if(x==1)
        {
            head=head.next;
        }
        Node prev=null;
        Node temp=head;
        while(temp!=null&&x-->=0)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        {
            return head;
        }
        prev.next=prev.next.next;
        return head;
    }
