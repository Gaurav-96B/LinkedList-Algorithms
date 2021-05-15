class LinkedList
{
   static Node sortDoubly(Node head)
    {
        if(head == null || head.next == null)
            return head;
            
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        
        middle.next = null;
        nextToMiddle.prev = null;
        
        Node left = sortDoubly(head);
        Node right = sortDoubly(nextToMiddle);
        
        Node sortedList = merge(left, right);
        return sortedList;
    }
    
    static Node merge(Node left, Node right)
    {
        Node result = null;
        
        if(left ==null)
            return right;
        
        if(right ==null)
            return left;
            
        if(left.data<=right.data)
        {
            result = left;
            result.next = merge(left.next, right);
            result.next.prev = left;
            result.prev = null;
        }
        else
        {
            result = right;
            result.next = merge(left, right.next);
            result.next.prev = right;
            result.prev = null;
        }
          
        return result;  
    }
    static Node getMiddle(Node head)
    {
        if(head == null)
            return head;
            
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        
        return slow;
    }
}
