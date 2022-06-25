Node flatten(Node root)
    {
	if(root==null||root.next==null)
	{
	    return root;
	}
	root.next=flatten(root.next);
	root=mergeLinkedList(root,root.next);
	return root;
    }
    Node mergeLinkedList(Node node1,Node node2)
    {
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while(node1!=null&&node2!=null)
        {
           if(node1.data<node2.data) 
           {
               temp.bottom=node1;
               temp=temp.bottom;
               node1=node1.bottom;
               
           }
           else
           {
               temp.bottom=node2;
               temp=temp.bottom;
               node2=node2.bottom;
           }
        }
        if(node1!=null)
        {
          temp.bottom=node1;  
        }
        else
        {
        temp.bottom=node2;
        }
        return dummyNode.bottom;
    }
