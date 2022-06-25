static Node segregate(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node zeroDummy=new Node(-1);
        Node zero=zeroDummy;
        Node oneDummy=new Node(-1);
        Node one=oneDummy;
        Node twoDummy=new Node(-1);
        Node two=twoDummy;
        
        Node temp=head;
        while(temp!=null)
        {
           if(temp.data==0) 
           {
               zero.next=temp;
               zero=zero.next;
           }
           if(temp.data==1) 
           {
               one.next=temp;
               one=one.next;
           }
           if(temp.data==2) 
           {
               two.next=temp;
               two=two.next;
           }
           temp=temp.next;
        }
        zero.next = (oneDummy.next!=null)?(oneDummy.next):(twoDummy.next);
        one.next = twoDummy.next;
        two.next = null;
        head = zeroDummy.next;
        return head;
        
    }
