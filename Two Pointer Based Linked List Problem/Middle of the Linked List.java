/*TC=>O(n)+O(n/2)
SC=>O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int nodeCount=0;
        while(temp!=null)
        {
          temp=temp.next;
            nodeCount++;
           
        }
        
        int traverseNode=(nodeCount/2)+1;
        ListNode temp1=head;
        int nodeCount1=1;
        while(temp1!=null)
        {
            if(nodeCount1==traverseNode)
            {
                break;
            }
            temp1=temp1.next;
            nodeCount1++;
             
            
        }
        return temp1;
        
    }
}
