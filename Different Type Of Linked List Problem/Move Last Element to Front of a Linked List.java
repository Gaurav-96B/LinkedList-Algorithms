public static Node moveToFront(Node head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node prev=null;
        Node temp=head;
        while(temp.next!=null)
        {
          prev=temp;
          temp=temp.next;  
        }
        temp.next=head;
        prev.next=null;
        return temp;
        
        
    }
