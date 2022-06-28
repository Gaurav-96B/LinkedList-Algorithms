public static Node removeAllDuplicates(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prev=dummy;
        while(head!=null)
        {
            if(head.next!=null&&head.data==head.next.data)
            {
              while(head.next!=null&&head.data==head.next.data) 
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
