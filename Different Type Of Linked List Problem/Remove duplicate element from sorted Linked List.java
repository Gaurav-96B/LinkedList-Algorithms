Node removeDuplicates(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
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
