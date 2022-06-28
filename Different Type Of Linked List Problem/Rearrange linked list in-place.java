public static Node rearrange(Node root)
    {
        if(root==null||root.next==null)
        {
            return root;
        }
        Node next=findMid(root);
        Node firstList=root;
        Node secondList=reverseList(next);
        while(secondList !=null)
        {
            Node node=firstList.next;
            firstList.next=secondList;
            firstList=secondList;
            secondList=node;
        }
        return root;
        
    }
    public static Node findMid(Node root)
    {
        if(root==null||root.next==null)
        {
            return root;
        }
        Node slow=root;
        Node fast=root;
        Node next=null;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        next=slow.next;
        slow.next=null;
        return next;
    }
    public static Node reverseList(Node head)
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
