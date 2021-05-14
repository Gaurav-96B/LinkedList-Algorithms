/*TC=>O(N/K)*K=>O(N)
SC=>O(1)*/

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1)
        {
            return head;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        
        ListNode cur=dummy;
        ListNode nex=dummy;
        ListNode pre=dummy;
        
        int count=0;
        while(cur.next!=null)
        {
            cur=cur.next;
            count++;
        }
        while(count>=k)
        {
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<k;i++)
            {
               cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;   
            }
            pre=cur;
            count=count-k;   
        }
        return dummy.next;
        
    }
}
