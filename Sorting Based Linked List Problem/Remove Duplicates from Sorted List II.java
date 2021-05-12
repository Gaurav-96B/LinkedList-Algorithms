/*TC=>O(N)
SC=>O(1)*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node = head;
        ListNode result = null;
        ListNode resultHead = null;
        
        while(node != null) 
        {
        int count = 1;
        while(node.next != null && node.val == node.next.val) 
        {
            count ++;
            node = node.next;
        }
            
            if(count == 1) 
            {
                if(result == null) 
                {
                    result = new ListNode(node.val);
                    resultHead = result;
                }
                else 
                {
                    result.next = new ListNode(node.val);
                    result = result.next;
                }
            }
            node = node.next;
        }
        return resultHead;   
    }
}

/*TC=>O(N)
SC=>O(1) or O(N) for call stack*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        if(head.val!=head.next.val)
        {
            head.next=deleteDuplicates(head.next);
            return head;
        }
        ListNode temp=head;
        while(temp!=null&&temp.val==head.val)
        {
            temp=temp.next;
        }
        return deleteDuplicates(temp);
    }
}

