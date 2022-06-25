Node reverseList(Node head)
    {
      if(head==null||head.next==null)
      {
          return head;
      }
      Node newHead=null;
      while(head!=null)
      {
          Node next=head.next;
          head.next=newHead;
          newHead=head;
          head=next;
          
      }
      return newHead;
    }
