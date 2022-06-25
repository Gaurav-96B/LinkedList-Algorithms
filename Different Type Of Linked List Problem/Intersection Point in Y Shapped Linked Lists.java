int intersectPoint(Node head1, Node head2)
	{
       if(head1==null||head2==null)
       {
           return -1;
       }
        Node a=head1;
        Node b=head2;
        while(a!=b)
        {
            if(a==null)
            {
                a=head2;
            }
            else
            {
                a=a.next;
            }
            if(b==null)
            {
                b=head1;
            }
            else
            {
                b=b.next;
            }
        }
      return a.data; 
	}
