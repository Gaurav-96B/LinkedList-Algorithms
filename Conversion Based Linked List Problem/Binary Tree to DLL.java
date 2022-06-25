Node headLinkedList;;
    Node prev=null;
    Node bToDLL(Node root)
    {
      if(root==null)
      {
          return root;
      }
      bToDLL(root.left);
      if(prev==null)
      {
          headLinkedList=root;
      }
      else
      {
         root.left=prev;
         prev.right=root;
      }
      prev=root;
      bToDLL(root.right);
      return headLinkedList;
        
    }
