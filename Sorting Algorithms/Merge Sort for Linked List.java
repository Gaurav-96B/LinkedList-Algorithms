class LinkedList
{
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
        Node leftSide=mergeSort(head);
        Node rightSide=mergeSort(slow);
        return mergeSort1(leftSide,rightSide);
    }
    static Node mergeSort1(Node leftside,Node rightside)
    {
        Node head=new Node(0);
        Node temp=head;
        while(leftside!=null&&rightside!=null)
        {
            if(leftside.data<rightside.data)
            {
                temp.next=leftside;
                leftside=leftside.next;
                
            }
            else
            {
                temp.next=rightside;
                rightside=rightside.next;
            }
            temp=temp.next;
        }
        if(leftside!=null)
        {
            temp.next=leftside;
        }
        else
        {
            temp.next=rightside;
        }
        return head.next;
    }

}
