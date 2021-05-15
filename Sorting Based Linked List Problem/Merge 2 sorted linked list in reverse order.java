class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
        Node head=new Node(0);
        Node temp=head;
        while(node1!=null&&node2!=null)
        {
            if(node1.data<=node2.data)
            {
                head.next=node1;
                node1=node1.next;
                head=head.next;
            }
            else
            {
               head.next=node2;
                node2=node2.next;
                head=head.next; 
            }
        }
        if(node1!=null)
        {
            head.next=node1;
            
        }
        else
        {
            head.next=node2;
        }
        return reverseList(temp.next);
    }
    Node reverseList(Node head) {
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
}
