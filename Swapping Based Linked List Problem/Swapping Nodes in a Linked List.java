/*TC=>O(N)
SC=>O(1)*/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode curr = head;
        int i = 1;
        while (curr != null && i != k) {
            curr = curr.next;
            i++;
        }
        ListNode first = curr;
        ListNode sec = head;
        
        while(curr.next != null) {
            curr = curr.next;
            sec = sec.next;
        }
        
        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
        return head;
        
    }
}

/*TC=>O(N) Or Two Pass
SC=>O(1)*/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int length = 0;
        
        ListNode firstNode = null;
        ListNode secondNode = null;
        
        while (curr != null)
        {
            if (k == ++length) 
            {
                firstNode = curr;
            }
            curr = curr.next;
        }
        
        curr = head;
        int index = 0;
		
        while (curr != null)
        {
            if ((length-k+1) == ++index) 
            {
                secondNode = curr;
            }
            curr = curr.next;
        }
        
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
        
        return head;
    }
}
