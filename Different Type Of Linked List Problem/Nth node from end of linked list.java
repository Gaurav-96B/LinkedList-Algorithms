 int getNthFromLast(Node head, int n)
    {
     Node a=head;
     Node b=head;
     int count=1;
     while(count!=n&&b!=null)
     {
         b=b.next;
         count++;
     }
     if(b==null)
     {
         return -1;
     }
     while(b.next!=null)
     {
         a=a.next;
         b=b.next;
         
     }
     return a.data;
     
    }
