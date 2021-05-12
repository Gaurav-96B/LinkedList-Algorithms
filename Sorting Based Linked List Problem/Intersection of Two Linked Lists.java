/*TC=>O(N+M)
SC=>O(N)*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode>hs=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null)
        {
            hs.add(temp);
            temp=temp.next;
        }
        ListNode temp1=headB;
        while(temp1!=null)
        {
            if(hs.contains(temp1))
            {
                return temp1;
            }
            temp1=temp1.next;
        }
        return null;
        
        
    }
}



/*TC=>O(2M)
SC=>O(1)*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA==null||headB==null)
       {
           return null;
       }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b)
        {
            if(a==null)
            {
                a=headB;
            }
            else
            {
                a=a.next;
            }
            if(b==null)
            {
                b=headA;
            }
            else
            {
                b=b.next;
            }
        }
      return a; 
    }
     
}
