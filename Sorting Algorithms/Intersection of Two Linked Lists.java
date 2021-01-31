class GFG
{
    static Node findIntersection(Node head1, Node head2)
    {
    return merge(mergeSort(head1),mergeSort(head2));
    }
    static Node mergeSort(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        Node l=mergeSort(head);
        Node r =mergeSort(slow);
        return merge1(l,r);
     }
     static Node merge1(Node l,Node r)
     {
        Node head=new Node(0);
         Node temp=head;
         while(l!=null&&r!=null)
         {
             if(l.data<r.data)
             {
                 head.next=l;
                 l=l.next;
                 head=head.next;
             }
             else 
             {
                 head.next=r;
                r=r.next;
                head=head.next;
             }
            
         }
         if(l!=null)
         {
           head.next=l;  
         }
         else
         {
             head.next=r;
         }
         return temp.next;
     }
     static Node merge(Node l,Node r)
     {
         Node head=new Node(0);
         Node temp=head;
         while(l!=null&&r!=null)
         {
             if(l.data<r.data)
             {
                 l=l.next;
             }
             else if(l.data>r.data)
             {
                r=r.next;
             }
             else
             {
                head.next=l;
                head=head.next;
                l=l.next;
                r=r.next;
                
             }
         }
         head.next=null;
         return temp.next;
     }  
}
