/* TC=>O(n1+n2)=>O(n)
SC=>O(n1+n2)*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
                head.next=l1;
                l1=l1.next;
                head=head.next;
            }
            else
            {
                head.next=l2;
                l2=l2.next;
                head=head.next;
            }
        }
        if(l1!=null)
        {
            head.next=l1;
        }
        else
        {
            head.next=l2;
        }
        return temp.next;
    }
}




/*TC=> O(n1+n2)=>O(n)
SC=>O(1)*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        if(l1.val>l2.val)
        {
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode res=l1;
        while(l1!=null&&l2!=null)
        {
          ListNode tmp=null;  
            while(l1!=null && l1.val<=l2.val)
            {
               tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;
            
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        return res;
    }
        
}
