 static int countNodesinLoop(Node head)
    {
      if(head==null)
      {
          return head.data;
      }
      Node slow=head;
      Node fast=head;
      while(fast!=null&&fast.next!=null)
      {
         slow=slow.next;
         fast=fast.next.next;
         if(slow==fast)
         {
             break;
         }
      }
      if(slow==fast)
      {
        int length=1;
        slow=slow.next;
        while(slow!=fast)
        {
           slow=slow.next;
           length++;
        }
        return length;
      }
      return 0;
    }
