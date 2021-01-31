class GFG
{
	Node findUnion(Node head1,Node head2)
	{
	    return mergeSort1(mergeSort(head1),mergeSort(head2));
	}
	Node mergeSort(Node head)
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
	    Node leftside=mergeSort(head);
	    Node rightside=mergeSort(slow);
	    return mergeSort1(leftside,rightside);
	}
	Node mergeSort1(Node l,Node r)
	{
	    Node head=new Node(0);
	    Node temp=head;
	    while(l!=null&&r!=null)
	    {
	        if(l.data<r.data)
	        {
	        temp.next=l;
	        l=l.next;
	        temp=temp.next;
	        }
	        else if(l.data>r.data)
	        {
	            temp.next=r;
	            r=r.next;
	            temp=temp.next;
	        }
	        else
	        {
	           temp.next=l;
	           l=l.next;
	           r=r.next;
	           temp=temp.next;
	        }
	    }
	    if(l!=null)
	    {
	        temp.next=l;
	    }
	    else
	    {
	        temp.next=r;
	    }
	    return head.next;
	}
}
