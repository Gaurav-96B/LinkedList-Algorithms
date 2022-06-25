boolean isPalindrome(Node head) 
    {
       if(head==null)
       {
            return false;
       }
       if(head.next==null)
       {
           return true;
       }
       Node slow=findMid(head);
       Node head1=head;
       Node head2=reverseList(slow);
       while(head1!=null&&head2!=null)
       {
           if(head1.data!=head2.data)
           {
               return false;
           }
           head1=head1.next;
           head2=head2.next;
       }
       return true;
    }
    Node findMid(Node head)
    {
       Node temp=null;
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null)
       {
          temp=slow;
          slow=slow.next;
          fast=fast.next.next;
       }
       temp.next=null;
       return slow;
    }
    Node reverseList(Node head)
    {
       Node dummy=null;
       while(head!=null)
       {
           Node next=head.next;
           head.next=dummy;
           dummy=head;
           head=next;
       }
       return dummy;
    }
    
