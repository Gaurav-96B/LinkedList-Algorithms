class Solution
{
    static Node segregate(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);
 
        
        Node zero = zeroD;
        Node one = oneD; 
        Node two = twoD;
     
        Node curr = head;
        while (curr!=null)
        {
            if (curr.data == 0)
            {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            }
            else if (curr.data == 1)
            {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
            else
            {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        
        if(oneD.next!=null)
        {
            zero.next=oneD.next;
        }
        else
        {
         zero.next=(twoD.next);   
        }
        one.next = twoD.next;
        two.next = null;
        head=zeroD.next;
        
        return head;
    }
}


